/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import static cauhinh.CauHinh.sc;
import java.util.ArrayList;
import java.util.Arrays;
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
        
        this.dsTieuChuan = new ArrayList<>();
    }

//    public void themTieuChuan(TieuChuan... a) {
//        this.getDanhSachTieuChuan().addAll(Arrays.asList(a));
//    }
    
    public void themTieuChuan(TieuChuan standard) {
        this.dsTieuChuan.add(standard);
    }

    public void themTieuChuan(TieuChuan... a) {
        this.dsTieuChuan.addAll(Arrays.asList(a));
        for (TieuChuan x : a) {
            x.setBkd(this);
        }
    }
    
    public void xoaTieuChuan(TieuChuan standard) {
        this.dsTieuChuan.remove(standard);
    }
    
    public void nhapBoKiemDinh(){
        System.out.print("Nhap ten bo kiem dinh: ");
        sc.nextLine();
        this.ten = sc.nextLine();
        System.out.print("Nhap ten khoa: ");
        this.khoa = sc.nextLine();       
    }
    
    public void hienThi() {
        System.out.print("=============\n");
        System.out.printf("Ten bo kiem dinh: %s\n", this.ten);
        System.out.printf("Ten khoa: %s\n", this.khoa);
    }
    
    public void hienThiTieuChuan(){
        this.getDanhSachTieuChuan().forEach(v -> v.hienThi());
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
