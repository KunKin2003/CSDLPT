
package com.BankingProject.model;

public class GoiRut {
    private int maGD;
    private String soTK;
    private String loaiGD;
    private String ngayGD;
    private String soTien;
    private String maNV;

    public GoiRut() {
    }

    public GoiRut(int maGD, String soTK, String loaiGD, String ngayGD, String soTien, String maNV) {
        this.maGD = maGD;
        this.soTK = soTK;
        this.loaiGD = loaiGD;
        this.ngayGD = ngayGD;
        this.soTien = soTien;
        this.maNV = maNV;
    }

    public int getMaGD() {
        return maGD;
    }

    public void setMaGD(int maGD) {
        this.maGD = maGD;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getLoaiGD() {
        return loaiGD;
    }

    public void setLoaiGD(String loaiGD) {
        this.loaiGD = loaiGD;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
    
}
