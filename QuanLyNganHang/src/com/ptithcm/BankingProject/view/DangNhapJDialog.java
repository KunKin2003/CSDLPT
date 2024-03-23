package com.ptithcm.BankingProject.view;

import com.ptithcm.BankingProject.controller.LoginController;
import javax.security.auth.login.LoginContext;

/**
 *
 * @author trung
 */
public class DangNhapJDialog extends javax.swing.JDialog {
    /**
     * Creates new form DangNhapJDialog
     */
    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jlbThongBao.setVisible(false);
        LoginController controller = new LoginController(jtfTaiKhoan, jpwMatKhau, jcbChiNhanh, jcbHienMatKhau, jbtDangNhap);
        controller.showMK();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbChiNhanh = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfTaiKhoan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jpwMatKhau = new javax.swing.JPasswordField();
        jbtDangNhap = new javax.swing.JButton();
        jcbHienMatKhau = new javax.swing.JCheckBox();
        jlbThongBao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel1.setText("ĐĂNG NHẬP");

        jcbChiNhanh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bến Thành", "Tân Định"}));
        jcbChiNhanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbChiNhanhActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Chi Nhánh");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setText("Tài Khoản");

        jtfTaiKhoan.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setText("Mật khẩu");

        jpwMatKhau.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        jbtDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jbtDangNhap.setText("Đăng Nhập");
        jbtDangNhap.setFocusPainted(false);
        jbtDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDangNhapActionPerformed(evt);
            }
        });

        jcbHienMatKhau.setText("Hiện mật khẩu");
        jcbHienMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHienMatKhauActionPerformed(evt);
            }
        });

        jlbThongBao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlbThongBao.setForeground(new java.awt.Color(255, 0, 51));
        jlbThongBao.setText("Vui lòng nhập thông tin đăng nhập");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcbHienMatKhau))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156))
                            .addComponent(jcbChiNhanh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTaiKhoan)
                            .addComponent(jpwMatKhau)
                            .addComponent(jbtDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbChiNhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpwMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jcbHienMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbThongBao)
                .addGap(18, 18, 18)
                .addComponent(jbtDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDangNhapActionPerformed
        if(jtfTaiKhoan.getText().length() == 0 || jpwMatKhau.getText().length() == 0){
            jlbThongBao.setVisible(true);
        }
    }//GEN-LAST:event_jbtDangNhapActionPerformed

    private void jcbChiNhanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbChiNhanhActionPerformed
        
    }//GEN-LAST:event_jcbChiNhanhActionPerformed

    private void jcbHienMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHienMatKhauActionPerformed
//        if(jcbHienMatKhau.isSelected()){
//            jpwMatKhau.setEchoChar((char) 0); // Hiện mật khẩu
//        }else{
//            jpwMatKhau.setEchoChar('*');
//        }
    }//GEN-LAST:event_jcbHienMatKhauActionPerformed


//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                DangNhapJDialog dialog = new DangNhapJDialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtDangNhap;
    private javax.swing.JComboBox<String> jcbChiNhanh;
    private javax.swing.JCheckBox jcbHienMatKhau;
    private javax.swing.JLabel jlbThongBao;
    private javax.swing.JPasswordField jpwMatKhau;
    private javax.swing.JTextField jtfTaiKhoan;
    // End of variables declaration//GEN-END:variables
}