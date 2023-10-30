package com.edusys.DAO;

import com.edusys.model_entity.ChuyenDe;
import com.edusys.utility_helper.JDBCHelper;
import com.edusys.utility_helper.MsgBox;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
//là một DAOConcrete     

public class BChuyenDeDao implements AEduSysDao<ChuyenDe, String> {

    String INSERT_SQL = "INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa)\n"
            + "values (? , ? , ? , ? , ? , ?);";
    String UPDATE_SQL = "UPDATE ChuyenDe "
            + "SET TenCD =?,  HocPhi =?, ThoiLuong =?, Hinh =?, MoTa =? WHERE MaCD=?;";
    String DELETE_SQL = "DELETE FROM ChuyenDe WHERE MaCD =?";
    String SELECT_ALL_SQL = "SELECT * FROM  ChuyenDe ";
    String SELECT_BY_ID_SQL = "SELECT * FROM ChuyenDe WHERE MaCD = ?";
    
    /*
gọi phương thức insert(ChuyenDe entity) thì sẽ truyền vào một đối tượng ChuyenDe chứa các thông tin chuyên đề 
cần thêm vào csdl.
     */
    @Override
    public void insert(ChuyenDe e) {
        JDBCHelper.update(INSERT_SQL,
                e.getMaCD(),
                e.getTenCD(),
                e.getHocPhi(),
                e.getThoiLuong(),
                e.getHinh(),
                e.getMoTa()
        );
    }

    @Override
    public void update(ChuyenDe e) {
        JDBCHelper.update(UPDATE_SQL,
                e.getTenCD(),
                e.getHocPhi(),
                e.getThoiLuong(),
                e.getHinh(),
                e.getMoTa(),
                e.getMaCD()
        );
    }

    @Override
    public void delete(String MaCD) {
            JDBCHelper.update(DELETE_SQL, MaCD);
    }

    @Override //tại vì JDBCHelper.query trả về là ResultSet 
//nên ko thể trực tiếp đc mà phải gián tiếp thông 
//qua p.t ở dưới để đổ dữ liệu từ ResultSet vào và trả về List
    public List<ChuyenDe> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    @Override //trả về một đối tượng CD theo MaCD
    public ChuyenDe selectById(String MaCD) {
        List<ChuyenDe> listCD = selectBySQL(SELECT_BY_ID_SQL, MaCD);
        if (!listCD.isEmpty()) {
//            System.out.println("Ton tai MaCD "+MaCD);
            return listCD.get(0); //phần tử đầu tiên bắt đầu từ 0.
        }
//        System.out.println("Ko tồn tại đối tượng có MaCD : " + MaCD);
        return null;
    }

    @Override
    public List<ChuyenDe> selectBySQL(String sql, Object... args) {
        List<ChuyenDe> listCD = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                ChuyenDe cd = new ChuyenDe();
                cd.setMaCD(rs.getString("MaCD"));
                cd.setTenCD(rs.getString("TenCD"));
                cd.setHocPhi(rs.getDouble("HocPhi"));
                cd.setThoiLuong(rs.getInt("ThoiLuong"));
                cd.setHinh(rs.getString("Hinh"));
                cd.setMoTa(rs.getString("MoTa"));
                listCD.add(cd);
            }
//rs.close(); Nó chỉ đóng đối tượng ResultSet mà ko đóng hẳn kết nối với SQL nên có thể thực hiện các hành động khác
            rs.getStatement().getConnection().close();
//Đóng kết nối ( Connection ) đến csdl mà đối tượng ResultSet sử dụng.
//Ko thể tương tác với csdl nữa. Mà đóng hẳn
        } catch (SQLException ex) {
            Logger.getLogger(BChuyenDeDao.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println("Lỗi truy vấn danh sách CĐ");
        }
        return listCD;
    }

}
