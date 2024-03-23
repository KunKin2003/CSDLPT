package com.ptithcm.BankingProject.model;

/**
 *
 * @author trung
 */
public class ChiNhanh {
    private String maCn;
    private String tenCn;
    private String diaChi;
    private String soDT;

    public ChiNhanh(String maCn, String tenCn, String diaChi, String soDT) {
        this.maCn = maCn;
        this.tenCn = tenCn;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public ChiNhanh() {
    }

    public String getMaCn() {
        return maCn;
    }

    public void setMaCn(String maCn) {
        this.maCn = maCn;
    }

    public String getTenCn() {
        return tenCn;
    }

    public void setTenCn(String tenCn) {
        this.tenCn = tenCn;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
    
}
