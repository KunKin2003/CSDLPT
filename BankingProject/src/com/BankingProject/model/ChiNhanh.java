
package com.BankingProject.model;

public class ChiNhanh {
    private String maCN;
    private String tenCN;
    private String diaChiString;
    private String soDT;

    public ChiNhanh() {
    }

    public ChiNhanh(String maCN, String tenCN, String diaChiString, String soDT) {
        this.maCN = maCN;
        this.tenCN = tenCN;
        this.diaChiString = diaChiString;
        this.soDT = soDT;
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }

    public String getDiaChiString() {
        return diaChiString;
    }

    public void setDiaChiString(String diaChiString) {
        this.diaChiString = diaChiString;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
    
    
}
