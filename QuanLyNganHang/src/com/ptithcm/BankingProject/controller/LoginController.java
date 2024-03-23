/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.BankingProject.controller;

import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author trung
 */
public class LoginController {
    private JTextField jtfUsername;
    private JPasswordField jpwPassword;
    private JComboBox jcbChiNhanh;
    private JCheckBox jcbHienMK;
    private JButton jbtLogin;

    public LoginController(JTextField jtfUsername, JPasswordField jpwPassword, JComboBox jcbChiNhanh, JCheckBox jcbHienMK, JButton jbtLogin) {
        this.jtfUsername = jtfUsername;
        this.jpwPassword = jpwPassword;
        this.jcbChiNhanh = jcbChiNhanh;
        this.jcbHienMK = jcbHienMK;
        this.jbtLogin = jbtLogin;
    }
    
    
    Class LoginButton implements MouseListener{
        private 
    }
}
