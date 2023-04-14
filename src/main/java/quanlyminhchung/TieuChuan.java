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
public class TieuChuan {
    
    public int soTC = 0;
    private static int dem = 0;
    private int id;
    private String ten;
    private String ndTienChuan;
    private BoKiemDinh bkd;
    private List<TieuChi> dsTieuChi = new ArrayList<>();

    {
        dem++;
        this.setId(dem);
    }
    
    public TieuChuan() {
        
    }
    
    public TieuChuan(String ten, String ndTienChuan, BoKiemDinh bkd) {
        this.ten = ten;
        this.ndTienChuan = ndTienChuan;       
        this.bkd = bkd;
        this.dsTieuChi = new ArrayList<>();
        
        this.bkd.getDanhSachTieuChuan().add(this);
    }
    
//    public void themTieuChi(TieuChi... a) {
//        this.getDanhSachTieuChi().addAll(Arrays.asList(a));
//    }
    
    public void themTieuChi(TieuChi... a) {
        this.dsTieuChi.addAll(Arrays.asList(a));
        for (TieuChi x : a) {
            x.setTieuChuan(this);
        }
    }

    public void nhapTieuChuan(){
        System.out.print("Nhap ten tieu chuan: ");
        sc.nextLine();
        this.ten = sc.nextLine();
        System.out.print("Nhap noi dung: ");
        this.ndTienChuan = sc.nextLine();
    }
    
    public void xoaTieuChi(TieuChi q) {
        this.dsTieuChi.remove(q);
    }
    
    public void hienThi() {        
        System.out.printf("%s. %s, %s\n", this.id, this.ten, this.ndTienChuan);
    }
    
    public void hienThiTieuChi(){
        this.getDanhSachTieuChi().forEach(v -> v.hienThi());
    }
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    public List<TieuChi> getDanhSachTieuChi() {
        return dsTieuChi;
    }

    public void setDanhSachTieuChi(ArrayList<TieuChi> danhSachTieuChi) {
        this.dsTieuChi = danhSachTieuChi;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the ndTienChuan
     */
    public String getNdTienChuan() {
        return ndTienChuan;
    }

    /**
     * @param ndTienChuan the ndTienChuan to set
     */
    public void setNdTienChuan(String ndTienChuan) {
        this.ndTienChuan = ndTienChuan;
    }

    /**
     * @return the bkd
     */
    public BoKiemDinh getBkd() {
        return bkd;
    }

    /**
     * @param bkd the bkd to set
     */
    public void setBkd(BoKiemDinh bkd) {
        this.bkd = bkd;
    }
}
