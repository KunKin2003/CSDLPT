
package com.BankingProject.model;

public class ChuyenTien {
    private int maGD;
    private String soTKChuyen;
    private String ngayGD;
    private String soTien;
    private String soTKNhan;
    private String maNV;

    public ChuyenTien() {
    }

    public ChuyenTien(int maGD, String soTKChuyen, String ngayGD, String soTien, String soTKNhan, String maNV) {
        this.maGD = maGD;
        this.soTKChuyen = soTKChuyen;
        this.ngayGD = ngayGD;
        this.soTien = soTien;
        this.soTKNhan = soTKNhan;
        this.maNV = maNV;
    }

    public int getMaGD() {
        return maGD;
    }

    public void setMaGD(int maGD) {
        this.maGD = maGD;
    }

    public String getSoTKChuyen() {
        return soTKChuyen;
    }

    public void setSoTKChuyen(String soTKChuyen) {
        this.soTKChuyen = soTKChuyen;
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

    public String getSoTKNhan() {
        return soTKNhan;
    }

    public void setSoTKNhan(String soTKNhan) {
        this.soTKNhan = soTKNhan;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
    
}
