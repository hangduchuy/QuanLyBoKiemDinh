/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huy
 */
class BoKiemDinh {
    private String ten;
    private String khoa;
    private List<TieuChuan> dsTieuChuan;

 
    public BoKiemDinh(String ten) {
        this.ten = ten;
        this.dsTieuChuan = new ArrayList<>();
    }

    public void themTieuChuan(TieuChuan standard) {
        this.dsTieuChuan.add(standard);
    }

    public void xoaTieuChuan(TieuChuan standard) {
        this.dsTieuChuan.remove(standard);
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
