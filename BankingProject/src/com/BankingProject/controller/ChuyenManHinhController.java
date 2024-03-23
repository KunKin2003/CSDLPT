
package com.BankingProject.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ChuyenManHinhController {
    private  JPanel root;
    private String kindSelected = "";

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem){
        this.kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(root);
        root.validate();
        root.repaint();
    }
    
    public void setEvent(){
        
    }
}
