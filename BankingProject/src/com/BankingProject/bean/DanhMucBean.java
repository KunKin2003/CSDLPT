
package com.BankingProject.bean;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DanhMucBean {
    private String kindString;
    private JPanel jpn;
    private JLabel jlbJLabel;

    public DanhMucBean() {
    }

    public DanhMucBean(String kindString, JPanel jpn, JLabel jlbJLabel) {
        this.kindString = kindString;
        this.jpn = jpn;
        this.jlbJLabel = jlbJLabel;
    }

    public String getKindString() {
        return kindString;
    }

    public void setKindString(String kindString) {
        this.kindString = kindString;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }

    public JLabel getJlbJLabel() {
        return jlbJLabel;
    }

    public void setJlbJLabel(JLabel jlbJLabel) {
        this.jlbJLabel = jlbJLabel;
    }
    
    
}
