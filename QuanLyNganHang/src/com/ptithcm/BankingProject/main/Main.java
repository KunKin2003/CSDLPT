
package com.ptithcm.BankingProject.main;

import com.ptithcm.BankingProject.view.DangNhapJDialog;
import com.ptithcm.BankingProject.view.MainJFrame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DangNhapJDialog dialog = new DangNhapJDialog(null, true);
        dialog.setTitle("Đăng nhập");
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);       
    }
}
