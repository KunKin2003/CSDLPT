package com.ptithcm.BankingProject.controller;

import com.ptithcm.BankingProject.bean.DanhMucBean;
import com.ptithcm.BankingProject.view.BaoCaoJPanel;
import com.ptithcm.BankingProject.view.GiaoDichJPanel;
import com.ptithcm.BankingProject.view.KhachHangJPanel;
import com.ptithcm.BankingProject.view.NhanVienJPanel;
import com.ptithcm.BankingProject.view.TaiKhoanJPanel;
import com.ptithcm.BankingProject.view.TrangChuJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.constant.DirectMethodHandleDesc;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.w3c.dom.Node;

public class ChuyenManHinhController {
    private  JPanel root;
    private String kindSelected = "";
    
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem){
        this.kindSelected = "TrangChu";
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        private JPanel jpnItem;
        private JLabel jlpItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlpItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlpItem = jlpItem;
        }

        @Override
        public void mouseClicked(MouseEvent e){
            switch (kind) {
                case "TrangChu":
                    this.node = new TrangChuJPanel();
                    break;
                case "NhanVien":
                    this.node = new NhanVienJPanel();
                    break;
                case "KhachHang":
                    this.node = new KhachHangJPanel();
                    break;
                case "GiaoDich":
                    this.node = new GiaoDichJPanel();
                    break;
                case "TaiKhoan":
                    this.node = new TaiKhoanJPanel();
                    break;
                case "BaoCao":
                    this.node = new BaoCaoJPanel();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(this.node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jpnItem.setBackground(new Color(255,249,2));
           jlpItem.setBackground(new Color(255,249,2));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(255,249,2));
            jlpItem.setBackground(new Color(255,249,2));
        }
        

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(193, 193, 0));
                jlpItem.setBackground(new Color(193, 193, 0));
            }
        }
        
    }
    
    private void setChangeBackground(String kind){
        for(DanhMucBean item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(255,249,2));
                item.getJlb().setBackground(new Color(255,249,2));
            }
            else{
                item.getJpn().setBackground(new Color(193,193,0));
                item.getJlb().setBackground(new Color(193,193,0));
            }
        }
    }
}
