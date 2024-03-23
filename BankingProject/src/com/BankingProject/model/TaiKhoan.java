
package com.BankingProject.model;

public class TaiKhoan {
    private String soTK;
    private String cmnd;
    private String soDu;
    private String MACN;

    public TaiKhoan() {
    }

    public TaiKhoan(String soTK, String cmnd, String soDu, String MACN) {
        this.soTK = soTK;
        this.cmnd = cmnd;
        this.soDu = soDu;
        this.MACN = MACN;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSoDu() {
        return soDu;
    }

    public void setSoDu(String soDu) {
        this.soDu = soDu;
    }

    public String getMACN() {
        return MACN;
    }

    public void setMACN(String MACN) {
        this.MACN = MACN;
    }
}
