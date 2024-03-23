/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ptithcm.BankingProject.view;

import com.ptithcm.BankingProject.bean.DanhMucBean;
import com.ptithcm.BankingProject.controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trung
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        setTitle("QUẢN LÝ NGÂN HÀNG");
        
        // Chuyển đổi giao diện menu
        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setView(jpnView, jlbTrangChu);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu",jpnView,jlbTrangChu));
        listItem.add(new DanhMucBean("NhanVien",jpnNhanVien,jlbNhanVien));
        listItem.add(new DanhMucBean("KhachHang",jpnKhachHang,jlbKhachHang));
        listItem.add(new DanhMucBean("BaoCao",jpnBaoCao,jlbBaoCao));
        listItem.add(new DanhMucBean("TaiKhoan",jpnTaiKhoan,jlbTaiKhoan));
        listItem.add(new DanhMucBean("GiaoDich",jpnGiaoDich,jlbGiaoDich));
        
        controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnNhanVien = new javax.swing.JPanel();
        jlbNhanVien = new javax.swing.JLabel();
        jpnBaoCao = new javax.swing.JPanel();
        jlbBaoCao = new javax.swing.JLabel();
        jpnTaiKhoan = new javax.swing.JPanel();
        jlbTaiKhoan = new javax.swing.JLabel();
        jpnGiaoDich = new javax.swing.JPanel();
        jlbGiaoDich = new javax.swing.JLabel();
        jpnKhachHang = new javax.swing.JPanel();
        jlbKhachHang = new javax.swing.JLabel();
        jbtDangXuat = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(51, 51, 51));

        jPanel4.setBackground(new java.awt.Color(255, 204, 51));

        jlbTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptithcm/BankingProject/image/user (1).png"))); // NOI18N
        jlbTrangChu.setText("jLabel6");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jpnNhanVien.setBackground(new java.awt.Color(193, 193, 0));
        jpnNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlbNhanVien.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptithcm/BankingProject/image/id-card.png"))); // NOI18N
        jlbNhanVien.setText("Nhân Viên");

        javax.swing.GroupLayout jpnNhanVienLayout = new javax.swing.GroupLayout(jpnNhanVien);
        jpnNhanVien.setLayout(jpnNhanVienLayout);
        jpnNhanVienLayout.setHorizontalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnNhanVienLayout.setVerticalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpnBaoCao.setBackground(new java.awt.Color(193, 193, 0));
        jpnBaoCao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlbBaoCao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbBaoCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptithcm/BankingProject/image/report.png"))); // NOI18N
        jlbBaoCao.setText("Báo Cáo");

        javax.swing.GroupLayout jpnBaoCaoLayout = new javax.swing.GroupLayout(jpnBaoCao);
        jpnBaoCao.setLayout(jpnBaoCaoLayout);
        jpnBaoCaoLayout.setHorizontalGroup(
            jpnBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBaoCaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jpnBaoCaoLayout.setVerticalGroup(
            jpnBaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBaoCaoLayout.createSequentialGroup()
                .addComponent(jlbBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jpnTaiKhoan.setBackground(new java.awt.Color(193, 193, 0));
        jpnTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlbTaiKhoan.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptithcm/BankingProject/image/account.png"))); // NOI18N
        jlbTaiKhoan.setText("Tài Khoản");

        javax.swing.GroupLayout jpnTaiKhoanLayout = new javax.swing.GroupLayout(jpnTaiKhoan);
        jpnTaiKhoan.setLayout(jpnTaiKhoanLayout);
        jpnTaiKhoanLayout.setHorizontalGroup(
            jpnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTaiKhoanLayout.setVerticalGroup(
            jpnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTaiKhoanLayout.createSequentialGroup()
                .addComponent(jlbTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpnGiaoDich.setBackground(new java.awt.Color(193, 193, 0));
        jpnGiaoDich.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlbGiaoDich.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbGiaoDich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptithcm/BankingProject/image/deposit.png"))); // NOI18N
        jlbGiaoDich.setText("Giao Dịch");

        javax.swing.GroupLayout jpnGiaoDichLayout = new javax.swing.GroupLayout(jpnGiaoDich);
        jpnGiaoDich.setLayout(jpnGiaoDichLayout);
        jpnGiaoDichLayout.setHorizontalGroup(
            jpnGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGiaoDichLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnGiaoDichLayout.setVerticalGroup(
            jpnGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnGiaoDichLayout.createSequentialGroup()
                .addComponent(jlbGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpnKhachHang.setBackground(new java.awt.Color(193, 193, 0));
        jpnKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jlbKhachHang.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlbKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptithcm/BankingProject/image/communication.png"))); // NOI18N
        jlbKhachHang.setText("Khách Hàng");

        javax.swing.GroupLayout jpnKhachHangLayout = new javax.swing.GroupLayout(jpnKhachHang);
        jpnKhachHang.setLayout(jpnKhachHangLayout);
        jpnKhachHangLayout.setHorizontalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnKhachHangLayout.setVerticalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jbtDangXuat.setBackground(new java.awt.Color(193, 193, 0));
        jbtDangXuat.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jbtDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ptithcm/BankingProject/image/logout.png"))); // NOI18N
        jbtDangXuat.setText("Đăng xuất");
        jbtDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnBaoCao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnView.setBackground(new java.awt.Color(255, 255, 255));
        jpnView.setPreferredSize(new java.awt.Dimension(1000, 575));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1014, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDangXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtDangXuatActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtDangXuat;
    private javax.swing.JLabel jlbBaoCao;
    private javax.swing.JLabel jlbGiaoDich;
    private javax.swing.JLabel jlbKhachHang;
    private javax.swing.JLabel jlbNhanVien;
    private javax.swing.JLabel jlbTaiKhoan;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnBaoCao;
    private javax.swing.JPanel jpnGiaoDich;
    private javax.swing.JPanel jpnKhachHang;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnTaiKhoan;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}