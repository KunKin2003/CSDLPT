package com.ptithcm.BankingProject.dao;

import com.ptithcm.BankingProject.model.NhanVien;
import java.util.List;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author trung
 */
public class NhanVienDAOImpl implements  NhanVienDAO{
    @Override
    public List<NhanVien> getList() {
        try {
            Connection connection = DBconnect.getConnection();
            String sql = "SELECT * FROM dbo.NhanVien";
            List<NhanVien> list = new ArrayList<>();
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMANV(rs.getString("MANV"));
                nhanVien.setHO(rs.getString("HO"));
                nhanVien.setTEN(rs.getString("TEN"));
                nhanVien.setCMND(rs.getString("CMND"));
                nhanVien.setPHAI(rs.getString("PHAI"));
                nhanVien.setDIACHI(rs.getString("DIACHI"));
                nhanVien.setSODT(rs.getString("SODT"));
                nhanVien.setMACN(rs.getString("MACN"));
                nhanVien.setTrangThaiXoa(rs.getInt("TrangThaiXoa"));
                
                list.add(nhanVien);
            }
            ps.close();
            rs.close();
            connection.close();
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        return null;
    }
    
    public static void main(String[] args) {
        NhanVienDAO nhanVienDAO = new NhanVienDAOImpl();
        System.out.println(nhanVienDAO.getList());
    }
}
