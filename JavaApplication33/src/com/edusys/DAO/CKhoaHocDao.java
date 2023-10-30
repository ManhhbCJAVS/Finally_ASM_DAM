package com.edusys.DAO;

import com.edusys.model_entity.KhoaHoc;
import com.edusys.utility_helper.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CKhoaHocDao implements AEduSysDao<KhoaHoc, String> {

    String INSERT_SQL = "INSERT INTO KhoaHoc "
            + "( MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV)\n"
            + "VALUES (?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE KhoaHoc\n"
            + "SET  NgayKG =?, GhiChu =? WHERE MaKH = ?";
    String DELETE_SQL = "DELETE FROM KhoaHoc WHERE MaKH =?";
    String SELECT_ALL_SQL = "SELECT * FROM KhoaHoc";
    String SELECT_BY_ID = "SELECT * FROM KhoaHoc where MaKH=?";
    String SELECT_MaCD_BY_ID = "SELECT * FROM KhoaHoc where MaCD=?";
    String SELECT_MaCD_BY_ID_SQL = "SELECT * FROM KhoaHoc where MaCD=?";
    String SELECT_MaNV_BY_ID_SQL = "SELECT * FROM KhoaHoc where MaNV=?";

    @Override //ko có MaKh và NgayTao vì MaKH tự tăng còn Ngày Tạo lấy theo ngày hiện tại bằng getDay().
    public void insert(KhoaHoc e) {
        JDBCHelper.update(INSERT_SQL,
                e.getMaCD(),
                e.getHocPhi(),
                e.getThoiLuong(),
                e.getNgayKG(),
                e.getGhiChu(),
                e.getMaNV()
        );
    }

    @Override
    public void update(KhoaHoc e) {
        JDBCHelper.update(UPDATE_SQL,
                e.getNgayKG(),
                e.getGhiChu(),
                e.getMaKH()
        );
    }

    @Override
    public void delete(String MaKH) {
        JDBCHelper.update(DELETE_SQL, MaKH);
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    @Override //lấy theo Mã KH
    public KhoaHoc selectById(String MaKH) {
        List<KhoaHoc> listKH = this.selectBySQL(SELECT_BY_ID, MaKH);
        if (listKH != null) {
            return listKH.get(0);
        }
        System.out.println("Ko tồn tại đối tượng có MaKH : " + MaKH);
        return null;
    }

    //Lấy mã CD trong Khóa học theo MaCD truyền vào
    public KhoaHoc select_MaCD_By_Id(String MaCD) {
        List<KhoaHoc> listKH = this.selectBySQL(SELECT_MaCD_BY_ID_SQL,
                 MaCD);
        if (listKH != null && !listKH.isEmpty()) {
            return listKH.get(0);
        }
        return null;
    }

    //Lấy mã Nhân Viên trong Khóa học theo MaNV truyền vào
    public KhoaHoc select_MaNV_By_Id(String MaNV) {
        List<KhoaHoc> listKH = this.selectBySQL(SELECT_MaNV_BY_ID_SQL, MaNV);
        if (listKH != null && !listKH.isEmpty()) {
            return listKH.get(0);
        }
        return null;
    }

    //Lấy tất cả khóa học theo mã Chuyên Đề
    public List<KhoaHoc> selectAllByMaCD(String MaCD) {
        return selectBySQL(SELECT_MaCD_BY_ID_SQL, MaCD);
    }

    @Override
    public List<KhoaHoc> selectBySQL(String sql, Object... args) {
        List<KhoaHoc> listKH = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                KhoaHoc kh = new KhoaHoc();
                kh.setMaKH(rs.getInt("MaKH"));
                kh.setMaCD(rs.getString("MaCD"));
                kh.setHocPhi(rs.getDouble("HocPhi"));
                kh.setThoiLuong(rs.getInt("ThoiLuong"));
                kh.setNgayKG(rs.getDate("NgayKG"));
                kh.setGhiChu(rs.getString("GhiChu"));
                kh.setMaNV(rs.getString("MaNV"));
                kh.setNgayTao(rs.getDate("NgayTao"));
                listKH.add(kh);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(CKhoaHocDao.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println("Lỗi truy vấn danh sách KH");
        }
        return listKH;
    }
    //Truy vấn tất cả CD theo Năm. ( dựa vào bảng Khóa Học )
    public List<Integer> selectYear() {
        String sql = "SELECT DISTINCT year(NgayKG) Year FROM KhoaHoc ORDER BY Year DESC";
        List<Integer> listYear = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql);
            while (rs.next()) {
                listYear.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return listYear;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
