package com.edusys.DAO;

import com.edusys.model_entity.NhanVien;
import com.edusys.utility_helper.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FNhanVienDao implements AEduSysDao<NhanVien, String> {

    final String INSERT_SQL = "INSERT INTO NhanVien (MaNV, MatKhau, HoTen, VaiTro) VALUES (?,?,?,?)";
    final String UPDATE_SQL = "UPDATE NhanVien SET MatKhau=?,HoTen=?,VaiTro=? WHERE MaNV =?";
    final String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV=?";
    final String Select_All_SQL = "Select NhanVien.* from NhanVien";
    final String SELECT_BY_ID_SQL = "SELECT*FROM NhanVien WHERE MaNV=?";

    @Override
    public void insert(NhanVien e) {
        JDBCHelper.update(INSERT_SQL,
                e.getMaNV(),
                e.getMatKhau(),
                e.getHoTen(),
                e.getVaiTro()
        );
    }

    @Override
    public void update(NhanVien e) {
        JDBCHelper.update(UPDATE_SQL,
                e.getMatKhau(),
                e.getHoTen(),
                e.getVaiTro(),
                e.getMaNV()
        );
    }

    @Override
    public void delete(String MaNV) {
        JDBCHelper.update(DELETE_SQL, MaNV);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySQL(Select_All_SQL);
    }

    @Override
    public NhanVien selectById(String MaNV) {
        List<NhanVien> Listnv = this.selectBySQL(SELECT_BY_ID_SQL, MaNV);
        //Dùng isEmpty() để kiểm tra trong danh sách truy xuất theo MaNV có trống không. 
        //Nếu trống thì tb báo là ko tồn tại nv đó.
        if (!Listnv.isEmpty()) {
            return Listnv.get(0);
        }
        System.out.println("Ko có nhan vien Ma : " + MaNV);
        return null;

    }

    @Override
    public List<NhanVien> selectBySQL(String sql, Object... args) {
        List<NhanVien> listNV = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setVaiTro(rs.getBoolean("VaiTro"));
                listNV.add(nv);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(FNhanVienDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Lỗi Truy vấn Query chung");
            ex.printStackTrace();
        }
        return listNV;
    }

}
