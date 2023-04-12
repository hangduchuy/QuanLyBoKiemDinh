/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import static cauhinh.CauHinh.sc;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huy
 */
public class BoKiemDinh {
    private String ten;
    private String khoa;
    private List<TieuChuan> dsTieuChuan = new ArrayList<>();

    public BoKiemDinh() {
       
    }
    
    public BoKiemDinh(String ten, String khoa) {
        this.ten = ten;
        this.khoa = khoa;
    }

    public void themTieuChuan(TieuChuan standard) {
        this.dsTieuChuan.add(standard);
    }

    public void xoaTieuChuan(TieuChuan standard) {
        this.dsTieuChuan.remove(standard);
    }
    
    public void nhapBoKiemDinh() throws ParseException, ClassNotFoundException, InstantiationException, Exception {
        System.out.print("Nhap ten bo kiem dinh: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap ten khoa: ");
        this.khoa = sc.nextLine();       
    }
    
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the danhSachTieuChuan
     */
    public List<TieuChuan> getDanhSachTieuChuan() {
        return dsTieuChuan;
    }

    /**
     * @param dsTieuChuan the dsTieuChuan to set
     */
    public void setDanhSachTieuChuan(List<TieuChuan> dsTieuChuan) {
        this.dsTieuChuan = dsTieuChuan;
    }

    /**
     * @return the khoa
     */
    public String getKhoa() {
        return khoa;
    }

    /**
     * @param khoa the khoa to set
     */
    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
}
