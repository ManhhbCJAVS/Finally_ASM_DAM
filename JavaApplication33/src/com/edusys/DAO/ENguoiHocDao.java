package com.edusys.DAO;

import com.edusys.model_entity.NguoiHoc;
import com.edusys.utility_helper.JDBCHelper;
import com.edusys.utility_helper.XDate;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ENguoiHocDao implements AEduSysDao<NguoiHoc, String> {

    String INSERT_SQL = "INSERT INTO NguoiHoc\n"
            + "(MaNH, HoTen, GioiTinh, NgaySinh, Email, DienThoai, GhiChu, MaNV, Hinh)\n"
            + "VALUES (?,?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NguoiHoc\n"
            + "SET HoTen =?, GioiTinh =?, NgaySinh =?, Email =?, DienThoai =?, GhiChu =?, MaNV =?, Hinh =? WHERE MaNH = ?";
    String DELETE_SQL = "DELETE FROM NguoiHoc where MaNH=?";
    String SELECT_ALL_SQL = "SELECT * FROM NguoiHoc";
    String SELECT_BY_ID_SQL = "SELECT*FROM NguoiHoc WHERE MaNH=?";
    String SELECT_MaNV_BY_ID_SQL = "SELECT*FROM NguoiHoc WHERE MaNV=?";
    String SELECT_NH_BY_MaKH_ID = " select * from NguoiHoc \n"
            + " where MaNH not in ( select MaNH from HocVien where MaKH = ? )";

    @Override
    public void insert(NguoiHoc e) {
        JDBCHelper.update(INSERT_SQL,
                e.getMaNH(),
                e.getHoTen(),
                e.getGioiTinh(),
                e.getNgaySinh(),
                e.getEmail(),
                e.getDienThoai(),
                e.getGhiChu(),
                e.getMaNV(),
                e.getHinh()
        );
    }

    @Override
    public void update(NguoiHoc e) {
        JDBCHelper.update(UPDATE_SQL,
                e.getHoTen(),
                e.getGioiTinh(),
                e.getNgaySinh(),
                e.getEmail(),
                e.getDienThoai(),
                e.getGhiChu(),
                e.getMaNV(),
                e.getHinh(),
                e.getMaNH()
        );
    }

    @Override
    public void delete(String MaNH) {
        JDBCHelper.update(DELETE_SQL, MaNH);
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return this.selectBySQL(SELECT_ALL_SQL);
    }
    //truy vấn danh sách người học ko có trog Khóa học truyền vào.
    public List<NguoiHoc> select_All_NH_BY_MaKH_ID(int maKH) {
        return this.selectBySQL(SELECT_NH_BY_MaKH_ID,maKH);
    }

    @Override
    public NguoiHoc selectById(String MaNH) {
        List<NguoiHoc> nh = this.selectBySQL(SELECT_BY_ID_SQL, MaNH);
        if (!nh.isEmpty()) {
            return nh.get(0);
        }
        return null;
    }

    public NguoiHoc selectMaNVById(String MaNV) {
        List<NguoiHoc> nh = this.selectBySQL(SELECT_MaNV_BY_ID_SQL, MaNV);
        if (nh != null) {
            return nh.get(0);
        }
        return null;
    }

    @Override
    public List<NguoiHoc> selectBySQL(String sql, Object... args) {
        List<NguoiHoc> listNH = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NguoiHoc nh = new NguoiHoc();
                nh.setMaNH(rs.getString("MaNH"));
                nh.setHoTen(rs.getString("HoTen"));
                nh.setGioiTinh(rs.getBoolean("GioiTinh"));
                nh.setNgaySinh(rs.getDate("NgaySinh"));
                nh.setEmail(rs.getString("Email"));
                nh.setDienThoai(rs.getString("DienThoai"));
                nh.setGhiChu(rs.getString("GhiChu"));
                nh.setMaNV(rs.getString("MaNV"));
                nh.setNgayDK(rs.getDate("NgayDK"));
                nh.setHinh(rs.getString("Hinh"));
                listNH.add(nh);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(ENguoiHocDao.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        return listNH;
    }

}
