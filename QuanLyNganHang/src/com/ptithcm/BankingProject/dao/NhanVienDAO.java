package com.ptithcm.BankingProject.dao;

import com.ptithcm.BankingProject.model.NhanVien;
import java.util.List;

@FunctionalInterface
public interface NhanVienDAO {
    public List<NhanVien> getList();
}
