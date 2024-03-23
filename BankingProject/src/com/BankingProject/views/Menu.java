
package com.BankingProject.views;

import com.BankingProject.Database.ConnectionDB;
import com.BankingProject.controller.ChuyenManHinhController;
import com.BankingProject.model.NhanVien;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Vector;

/**
 *
 * @author trung
 */
public class Menu extends javax.swing.JFrame {

    private ConnectionDB connectionDb;
    /**
     * Creates new form Menu
     */
    public Menu(Login login) {
        initComponents();
        this.connectionDb = login.getConn();
        setTitle("QUẢN LÝ NGÂN HÀNG");
        ChuyenManHinhController controller = new ChuyenManHinhController(jPanel1);
        controller.setView(jPanel1, jLabel1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnKhachHang = new javax.swing.JButton();
        btnGiaoDich = new javax.swing.JButton();
        btnBaocao = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnTaiKhoan = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        panelNhanVien = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTen_NV = new javax.swing.JTextField();
        txtHo_NV = new javax.swing.JTextField();
        TxtCMND_NV = new javax.swing.JTextField();
        txtDiaChi_NV = new javax.swing.JTextField();
        txtSDT_NV = new javax.swing.JTextField();
        txtMaCN_NV = new javax.swing.JTextField();
        cboPhai_NV = new javax.swing.JComboBox<>();
        cboTrangThai = new javax.swing.JComboBox<>();
        panelThem_Sua_Xoa = new javax.swing.JPanel();
        btnGhi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnGhi1 = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtTimKiem1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ngân Hàng");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\user (1).png")); // NOI18N

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Xin chào,");

        btnKhachHang.setBackground(new java.awt.Color(153, 153, 0));
        btnKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\communication.png")); // NOI18N
        btnKhachHang.setText("Khách hàng");
        btnKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnGiaoDich.setBackground(new java.awt.Color(153, 153, 0));
        btnGiaoDich.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnGiaoDich.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\deposit.png")); // NOI18N
        btnGiaoDich.setText("Giao dịch");
        btnGiaoDich.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGiaoDich.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGiaoDich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaoDichActionPerformed(evt);
            }
        });

        btnBaocao.setBackground(new java.awt.Color(153, 153, 0));
        btnBaocao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnBaocao.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\report.png")); // NOI18N
        btnBaocao.setText("Báo cáo");
        btnBaocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaocao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBaocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaocaoActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(153, 153, 0));
        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\id-card.png")); // NOI18N
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(153, 153, 0));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\logout.png")); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setBorder(null);
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnTaiKhoan.setBackground(new java.awt.Color(153, 153, 0));
        btnTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnTaiKhoan.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\icons8-merchant-account-32.png")); // NOI18N
        btnTaiKhoan.setText("Tài khoản");
        btnTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });

        jLabel14.setText("jLabel14");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGiaoDich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBaocao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBaocao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaiKhoan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        panelNhanVien.setBackground(new java.awt.Color(255, 255, 255));

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Mã nhân viên");

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ", "Tên", "CMND", "Phái", "Địa chỉ", "Số điện thoại", "Mã chi nhánh", "Trạng thái"
            }
        ));
        tbNhanVien.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbNhanVien);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Trạng thái");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Họ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Tên");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("CMND");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Số điện thoại");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Địa chỉ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Phái");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Mã nhân viên");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText("Mã Chi nhánh");

        txtMaNV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtTen_NV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtHo_NV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        TxtCMND_NV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtDiaChi_NV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtSDT_NV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtMaCN_NV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        cboPhai_NV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ"}));

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Làm việc", "Nghỉ"}));
        cboTrangThai.setEnabled(false);

        btnGhi.setBackground(new java.awt.Color(51, 51, 51));
        btnGhi.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnGhi.setForeground(new java.awt.Color(204, 204, 0));
        btnGhi.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\save.png")); // NOI18N
        btnGhi.setText("Ghi");

        btnXoa.setBackground(new java.awt.Color(51, 51, 51));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(204, 204, 0));
        btnXoa.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\delete.png")); // NOI18N
        btnXoa.setText("Xóa");

        btnThem.setBackground(new java.awt.Color(51, 51, 51));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnThem.setForeground(new java.awt.Color(204, 204, 0));
        btnThem.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\add.png")); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.setInheritsPopupMenu(true);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnGhi1.setBackground(new java.awt.Color(51, 51, 51));
        btnGhi1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnGhi1.setForeground(new java.awt.Color(204, 204, 0));
        btnGhi1.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\undo.png")); // NOI18N
        btnGhi1.setText("Phục hồi");

        btnThoat.setBackground(new java.awt.Color(51, 51, 51));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(204, 204, 0));
        btnThoat.setIcon(new javax.swing.ImageIcon("D:\\Student\\Junior2\\CSDLPT\\BankingProject\\img\\exit.png")); // NOI18N
        btnThoat.setText("Thoát");

        javax.swing.GroupLayout panelThem_Sua_XoaLayout = new javax.swing.GroupLayout(panelThem_Sua_Xoa);
        panelThem_Sua_Xoa.setLayout(panelThem_Sua_XoaLayout);
        panelThem_Sua_XoaLayout.setHorizontalGroup(
            panelThem_Sua_XoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThem_Sua_XoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnGhi1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        panelThem_Sua_XoaLayout.setVerticalGroup(
            panelThem_Sua_XoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThem_Sua_XoaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelThem_Sua_XoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGhi1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Họ và tên");

        txtTimKiem1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTimKiem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiem1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNhanVienLayout = new javax.swing.GroupLayout(panelNhanVien);
        panelNhanVien.setLayout(panelNhanVienLayout);
        panelNhanVienLayout.setHorizontalGroup(
            panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelNhanVienLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNhanVienLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelNhanVienLayout.createSequentialGroup()
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen_NV, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txtMaNV)
                            .addComponent(txtHo_NV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtCMND_NV)
                            .addComponent(cboPhai_NV, 0, 190, Short.MAX_VALUE)
                            .addComponent(txtDiaChi_NV))
                        .addGap(98, 98, 98)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboTrangThai, 0, 191, Short.MAX_VALUE)
                            .addComponent(txtSDT_NV)
                            .addComponent(txtMaCN_NV))
                        .addContainerGap(21, Short.MAX_VALUE))))
            .addComponent(panelThem_Sua_Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelNhanVienLayout.setVerticalGroup(
            panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNhanVienLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiem)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiem1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNhanVienLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCMND_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNhanVienLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSDT_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboPhai_NV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtHo_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNhanVienLayout.createSequentialGroup()
                        .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addGap(14, 14, 14)
                .addGroup(panelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTen_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtDiaChi_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaCN_NV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(panelThem_Sua_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void showDulieuNhanVien(){
        try {
            tbNhanVien.removeAll();
            String[] arr = {"Mã nhân viên", "Họ", "Tên", "CMND", "Phái", "Địa chỉ", "Số điện thoại", "Mã chi nhánh", "Trạng thái"};
            DefaultTableModel model = new DefaultTableModel(arr,0);
            Connection connection = this.connectionDb.getConn();
            System.out.println(connection);
            String query = "SELECT * FROM dbo.NhanVien";
            PreparedStatement ps = connection.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector vector = new Vector();
                vector.add(rs.getString("MANV"));
                vector.add(rs.getString("HO"));
                vector.add(rs.getString("TEN"));
                vector.add(rs.getString("CMND"));
                vector.add(rs.getString("DIACHI"));
                vector.add(rs.getString("PHAI"));
                vector.add(rs.getString("SODT"));
                vector.add(rs.getString("MANV"));
                vector.add(rs.getString("MACN"));
                vector.add(rs.getInt("TRANGTHAI"));
                model.addRow(vector);
            }
            
            tbNhanVien.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }     
         
    }
    
    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        btnBaocao.setBackground(new Color(153,153,0));
        btnGiaoDich.setBackground(new Color(153,153,0));
        btnKhachHang.setBackground(new Color(153,153,0));
        btnNhanVien.setBackground(new Color(255,255,51));
        btnTaiKhoan.setBackground(new Color(153,153,0));
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        btnBaocao.setBackground(new Color(153,153,0));
        btnGiaoDich.setBackground(new Color(153,153,0));
        btnNhanVien.setBackground(new Color(153,153,0));
        btnKhachHang.setBackground(new Color(255,255,51));
        btnTaiKhoan.setBackground(new Color(153,153,0));
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnGiaoDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaoDichActionPerformed
        btnBaocao.setBackground(new Color(153,153,0));
        btnNhanVien.setBackground(new Color(153,153,0));
        btnKhachHang.setBackground(new Color(153,153,0));
        btnGiaoDich.setBackground(new Color(255,255,51));
        btnTaiKhoan.setBackground(new Color(153,153,0));
    }//GEN-LAST:event_btnGiaoDichActionPerformed

    private void btnBaocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaocaoActionPerformed
        btnNhanVien.setBackground(new Color(153,153,0));
        btnGiaoDich.setBackground(new Color(153,153,0));
        btnKhachHang.setBackground(new Color(153,153,0));
        btnBaocao.setBackground(new Color(255,255,51));
        btnTaiKhoan.setBackground(new Color(153,153,0));
    }//GEN-LAST:event_btnBaocaoActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed

    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
//        if(txtHo_NV.equals("")||txtTen_NV.equals("")||txtDiaChi_NV.equals("")||
//                txtDiaChi_NV.equals("")||TxtCMND_NV.equals("")||txtSDT_NV.equals("")){
//            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin");
//        }
//        else{
//            String data = {txtMaNV.getText(),txtHo_NV.getText(),txt
//            DefaultTableModel tbModel = (DefaultTableModel)jTable1.getModel();
//            tbModel.addRow(nv);
//        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        btnNhanVien.setBackground(new Color(153,153,0));
        btnGiaoDich.setBackground(new Color(153,153,0));
        btnKhachHang.setBackground(new Color(153,153,0));
        btnBaocao.setBackground(new Color(153,153,0));
        btnTaiKhoan.setBackground(new Color(255,255,51));
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void txtTimKiem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiem1ActionPerformed
        
    }//GEN-LAST:event_txtTimKiem1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        showDulieuNhanVien();
    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtCMND_NV;
    private javax.swing.JButton btnBaocao;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnGhi1;
    private javax.swing.JButton btnGiaoDich;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboPhai_NV;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelNhanVien;
    private javax.swing.JPanel panelThem_Sua_Xoa;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtDiaChi_NV;
    private javax.swing.JTextField txtHo_NV;
    private javax.swing.JTextField txtMaCN_NV;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtSDT_NV;
    private javax.swing.JTextField txtTen_NV;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimKiem1;
    // End of variables declaration//GEN-END:variables
}
