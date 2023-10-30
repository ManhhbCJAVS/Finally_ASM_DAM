
package com.edusys.model_entity;

public class NhanVien {
    private String maNV;
    
    private String matKhau;
    private String hoTen;
    
    private Boolean   vaiTro;
    
    public NhanVien() {
    }
    public NhanVien(String maNV, String matKhau, String hoTen, Boolean vaiTro) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.vaiTro = vaiTro;
    }
    public String getMaNV() {
        return maNV;
    }
    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    public String getMatKhau() {
        return matKhau;
    }
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public Boolean getVaiTro() {
        return vaiTro;
    }
    public void setVaiTro(Boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
    
    
}
