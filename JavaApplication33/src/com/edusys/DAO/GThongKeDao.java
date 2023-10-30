package com.edusys.DAO;

import com.edusys.utility_helper.JDBCHelper;
import com.edusys.utility_helper.MsgBox;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class GThongKeDao {

    /*
    Phương thức nhận các tham số là  :
    sql  : Câu truy vấn SQL.
    cols : Danh sách tên các cột cần lấy dữ liệu. 
    args : Danh sách tham số.
    List<Object[]> : Kiểu trả một danh sách ( List ) rỗng để lưu trữ kq.
    Danh sách này chứa các mảng ( array ) các giá trị. Mỗi mảng tương ứng với 1 bản ghi trog kq truy vấn.
     */
    //Là phương thức bổ trợ cho mấy phương thức ở dưới.
    public List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        //B1. Tạo một Danh sách rỗng chứa các mảng. 
        List<Object[]> list = new ArrayList<>();
        try {
            //B2. Thực hiện truy vấn để có một đống kết quả.
            ResultSet rs = JDBCHelper.query(sql, args);
            //B3: Dùng vòng lặp while duyệt từng bản ghi(dòng) trong Table ở SQL server.
            while (rs.next()) {
                //B4: Tạo ra một mảng có độ dài tương ứng với các cột thiết lập để chứa hết các giá trị các cột tương ứng trên một bản ghi.
                Object[] vals = new Object[cols.length];
                //vd: vals = [null , null ]; -- Đây là một mảng với các cột khi thiết lập là null.

                //B5: Dùng vòng lặp for để thiết lập giá trị cho các phần tử ở mảng tương ứng với các cột ở trong một bản ghi(dòng) trong bảng.
                //Với một lần duyệt nó sẽ cho ra một mảng riêng. Và List nó sẽ chứa tất cả các mảng.
                for (int i = 0; i < cols.length; i++) {
                    //Thiết lập giá trị cho mảng cho các phần tử = tổng số cột truyền vào.
                    vals[i] = rs.getObject(cols[i]);
                    //Sau khi duyệt xog một vòng thì mảng có giá trị như sau 
                    //vals [ vals[0] , vals[1] , vals[2] , ..... ] ( độ dài tùy số cột.
                }
                //B6: cho các mảng vào danh sách List để chứa các mảng
                list.add(vals);
                //Và vòng lặp này nó sẽ cứ lặp liên tục cho đến khi hết bản ghi(Dòng) của Table trog SQL Server.
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            MsgBox.alter(null, "Lỗi truy vấn dữ liệu từ PT bổ trợ.");
            e.printStackTrace();
        }
        return null;
    }

    public List<Object[]> getSoLuongNguoiHoc() {
        String sql = "{ CALL sp_ThongKeNguoiHocTheoNam  }";
        String[] cols = {"Năm", "Số_Lượng", "Ngày_Đăng_Ký_Đầu_Tiên", "Ngày_Đăng_Ký_Cuối_Cùng"};
        return getListOfArray(sql, cols);
    }

    public List<Object[]> getBangDiemTheoMaKH(int MaKH) {
        String sql = " { CALL sp_ThongKeBangDiem_TheoKhoaHoc(?) }";
        String[] cols = {"Mã Người Học", "Họ và tên", "Điểm Người Học"};
        return getListOfArray(sql, cols, MaKH);
    }

    public List<Object[]> getDiemTheoMaCD() {
        String sql = "{CALL  sp_BangDiemTheoCD }";
        String[] cols = {"Tên Chuyên Đề", "Tổng số người học", "Điểm thấp  nhất", "Điểm cao nhất", "Điểm trung bình"};
        List<Object[]> list = this.getListOfArray(sql, cols);
        for (Object[] obj : list) {
            obj[4] = String.format("%.1f", obj[4]);
        }
//        return getListOfArray(sql, cols);
        return list;
    }

    public List<Object[]> getDoanhThuTheoNam(int year) {
        String sql = "{CALL sp_TongHopDoanhThu (?) }";
        String[] cols = {"Tên Chuyên Đề", "Số Khóa Học", "Số Học Viên", "Doanh Thu theo từng chuyên đề", "HP Cao Nhất của khóa", "HP Thấp Nhất của khóa", "HP Trung Bình của tất cả các khóa"};

        List<Object[]> list = this.getListOfArray(sql, cols, year);
        for (Object[] os : list) {
            os[3] = String.format("%.1f", os[3]); //doanh thu
            os[4] = String.format("%.1f", os[4]); //thapnhat
            os[5] = String.format("%.1f", os[5]); //caonhat
            os[6] = String.format("%.1f", os[6]); //trungbinh
        }
        return list;
//        return getListOfArray(sql, cols, year);
    }

}
