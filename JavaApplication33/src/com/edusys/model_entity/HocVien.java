package com.edusys.model_entity;
public class HocVien {
    
    private int     maHV;
    
    private String  maNH;
    private int     maKH;
    private Double  diem;

    public HocVien() {
    }

    public HocVien(int maHV, String maNH, int maKH, Double diem) {
        this.maHV = maHV;
        this.maNH = maNH;
        this.maKH = maKH;
        this.diem = diem;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public String getMaNH() {
        return maNH;
    }

    public void setMaNH(String maNH) {
        this.maNH = maNH;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

   
    
    
    
}
