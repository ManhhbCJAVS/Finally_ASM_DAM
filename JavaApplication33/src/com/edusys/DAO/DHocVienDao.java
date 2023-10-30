package com.edusys.DAO;

import com.edusys.model_entity.HocVien;
import com.edusys.model_entity.KhoaHoc;
import com.edusys.utility_helper.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DHocVienDao implements AEduSysDao<HocVien, String> {

    String INSERT_SQL = "insert into HocVien(MaKH,MaNH) values(?,?)";
    String UPDATE_SQL = "update HocVien set Diem=? where MaHV=?";
    String DELETE_SQL = "delete from HocVien where MaHV=?";
    String SELECT_ALL_SQL = "select * from HocVien";
    String SELECT_BY_ID = "select * from HocVien where MaHV=?";
    String select_HV_By_MaNH_ID = "select * from HocVien where MaNH = ?";
    String SELECT_HV_BY_MaKH_ID = "select * from HocVien where MaKH =?";

    @Override
    public void insert(HocVien e) {
        JDBCHelper.update(INSERT_SQL,
                e.getMaKH(),
                e.getMaNH()
        );
    }

    @Override //Update ở đây là cập nhật điểm thôi
    public void update(HocVien e) {
        JDBCHelper.update(UPDATE_SQL,
                e.getDiem(),
                e.getMaHV()
        );
    }

    @Override
    public void delete(String MaHV) {
        JDBCHelper.update(DELETE_SQL, MaHV);
    }

    @Override
    public List<HocVien> selectAll() {
        return selectBySQL(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectById(String MaHV) {
        List<HocVien> listHV = selectBySQL(SELECT_BY_ID, MaHV);
        if (!listHV.isEmpty()) {
            return listHV.get(0);
        }
        return null;
    }

    //Dựa vào MaNH tìm một đối tượng Học Viên
    public HocVien selectHV_By_MaNH(String MaNH) {
        List<HocVien> listHV = selectBySQL(select_HV_By_MaNH_ID, MaNH);
        if (!listHV.isEmpty()) {
            return listHV.get(0);
        }
        return null;
    }

    //Dựa vào MaKH truy vấn ra các học viên tham gia khóa học đó.
    public List<HocVien> selectHV_By_MaKH(String MaKH) {
        return selectBySQL(SELECT_HV_BY_MaKH_ID, MaKH);
    }

    @Override
    public List<HocVien> selectBySQL(String sql, Object... args) {
        List<HocVien> listHV = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                HocVien hv = new HocVien();
                hv.setMaHV(rs.getInt("MaHV"));
                hv.setMaKH(rs.getInt("MaKH"));
                hv.setMaNH(rs.getString("MaNH"));
                hv.setDiem(rs.getDouble("Diem"));
                listHV.add(hv);
            }
            rs.getStatement().getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(DHocVienDao.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println("Lỗi truy vấn danh sách Học Viên");
        }
        return listHV;
    }

}
