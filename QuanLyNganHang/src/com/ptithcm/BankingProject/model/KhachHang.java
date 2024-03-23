package com.ptithcm.BankingProject.model;

import java.util.Date;

public class KhachHang {
    private String CMND;
    private String HO;
    private String ten;
    private String diaChi;
    private String phai;
    private Date ngayCap;
    private String soDT;
    private String MACN;

    public KhachHang() {
    }

    public KhachHang(String CMND, String HO, String ten, String diaChi, String phai, Date ngayCap, String soDT, String MACN) {
        this.CMND = CMND;
        this.HO = HO;
        this.ten = ten;
        this.diaChi = diaChi;
        this.phai = phai;
        this.ngayCap = ngayCap;
        this.soDT = soDT;
        this.MACN = MACN;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getHO() {
        return HO;
    }

    public void setHO(String HO) {
        this.HO = HO;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public Date getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(Date ngayCap) {
        this.ngayCap = ngayCap;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getMACN() {
        return MACN;
    }

    public void setMACN(String MACN) {
        this.MACN = MACN;
    }
}
