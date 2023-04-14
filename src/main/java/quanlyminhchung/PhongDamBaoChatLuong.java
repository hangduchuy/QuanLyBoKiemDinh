/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import static cauhinh.CauHinh.SO_KIEM_DINH_TIEU_CHUAN_TOI_DA;
import static cauhinh.CauHinh.SO_KIEM_DINH_TIEU_CHUAN_TOI_THIEU;
import static cauhinh.CauHinh.SO_TIEU_CHUAN_TIEU_CHI_TOI_THIEU;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Huy
 */
public class PhongDamBaoChatLuong {
    
    private List<BoKiemDinh> boKiemDinh = new ArrayList<>();
    private List<TieuChuan> dsTieuChuan = new ArrayList<>();
    private List<TieuChi> dsTieuChi = new ArrayList<>();
    private List<MinhChung> danhSachMinhChung = new ArrayList<>();

    public PhongDamBaoChatLuong() {
        this.boKiemDinh = new ArrayList<>();
    }
    
    public TieuChi locID(int id) {
        return this.dsTieuChi.stream().filter(h -> h.getId() == id).findFirst().get();
    }
    
    public TieuChuan locIDTC(int id) {
        return this.dsTieuChuan.stream().filter(h -> h.getId() == id).findFirst().get();
    }
    
    public List<TieuChi> timKiem(int id) { // tim theo id
        return this.dsTieuChi.stream()
                .filter(c -> c.getId() == id)
                .collect(Collectors.toList());       
    }  
    
    public void themBoKiemDinh(BoKiemDinh... a) {
        this.boKiemDinh.addAll(Arrays.asList(a));  
    }
    
    public void themBoKiemDinh(ArrayList<BoKiemDinh> ds) {
        this.boKiemDinh.addAll(ds);
    }
    
    public void themTieuChuan(TieuChuan... a) {
        this.dsTieuChuan.addAll(Arrays.asList(a));  
    }
    
    public void themTieuChi(TieuChi... a) {
        this.dsTieuChi.addAll(Arrays.asList(a));       
    }
    
    public void themMinhChung(MinhChung... a) {
        this.getDanhSachMinhChung().addAll(Arrays.asList(a));
    }
    
    public void ganTieuChi(TieuChuan tc, TieuChi... q) throws Exception {
        this.dsTieuChuan.stream().filter(h -> h.getId() == tc.getId()).findFirst().get().themTieuChi(q);
    }
    
    public void xoaTieuChuan(TieuChuan q) {
        this.dsTieuChuan.remove(q);
    }
    
    public void xoaTieuChuan(TieuChi q) {
        this.dsTieuChi.remove(q);
    }
    
    public void xoaTieuChi(List<TieuChi> id) {
        this.dsTieuChi.removeAll(id);
    }
        
    public void sapXep(){
        this.getDanhSachMinhChung().sort(Comparator.comparing(MinhChung::getNgayBanHanh)
                .thenComparing(MinhChung::getTen, Comparator.reverseOrder()));
    }
    
    public void sapXep(List<MinhChung> a){
        a.sort(Comparator.comparing(MinhChung::getNgayBanHanh)
                .thenComparing(MinhChung::getTen, Comparator.reverseOrder()));
    }
    
    public boolean kiemTraTieuChuan(){  
        int doDai = dsTieuChuan.size();
        if(doDai < SO_KIEM_DINH_TIEU_CHUAN_TOI_THIEU || doDai > SO_KIEM_DINH_TIEU_CHUAN_TOI_DA){
            return false;
        }    
        return true;
    }
    
    
    public boolean kiemTraTieuChi(){
        int doDai = dsTieuChi.size();
        if(doDai < SO_TIEU_CHUAN_TIEU_CHI_TOI_THIEU){
            return false;
        }
        return true;
    }
    
    public boolean kiemTraTieuChi(List<TieuChi> a){       
        int doDai = a.size();
        if(doDai < SO_TIEU_CHUAN_TIEU_CHI_TOI_THIEU){
            return false;
        }
        return true;
    }
    
    public void hienThiBoKiemDinh(){
        this.getBoKiemDinh().forEach(v -> v.hienThi());
    }
    
    public void hienThiTieuChuan(){
        this.getDsTieuChuan().forEach(v -> v.hienThi());
    }
    
    public void hienThiTieuChi(){
        this.getDsTieuChi().forEach(v -> v.hienThi());
    }
    
    public void hienThiMinhChung(){
        this.danhSachMinhChung.forEach(v -> v.hienThi());
    }
   
    /**
     * @return the boKiemDinh
     */
    public List<BoKiemDinh> getBoKiemDinh() {
        return boKiemDinh;
    }

    /**
     * @param boKiemDinh the boKiemDinh to set
     */
    public void setBoKiemDinh(List<BoKiemDinh> boKiemDinh) {
        this.boKiemDinh = boKiemDinh;
    }

    /**
     * @return the dsTieuChi
     */
    public List<TieuChi> getDsTieuChi() {
        return dsTieuChi;
    }

    /**
     * @param dsTieuChi the dsTieuChi to set
     */
    public void setDsTieuChi(List<TieuChi> dsTieuChi) {
        this.dsTieuChi = dsTieuChi;
    }

    /**
     * @return the dsTieuChuan
     */
    public List<TieuChuan> getDsTieuChuan() {
        return dsTieuChuan;
    }

    /**
     * @param dsTieuChuan the dsTieuChuan to set
     */
    public void setDsTieuChuan(List<TieuChuan> dsTieuChuan) {
        this.dsTieuChuan = dsTieuChuan;
    }

    /**
     * @return the danhSachMinhChung
     */
    public List<MinhChung> getDanhSachMinhChung() {
        return danhSachMinhChung;
    }

    /**
     * @param danhSachMinhChung the danhSachMinhChung to set
     */
    public void setDanhSachMinhChung(List<MinhChung> danhSachMinhChung) {
        this.danhSachMinhChung = danhSachMinhChung;
    }
    

    /**
     * @return the boKiemDinh
     */
    
}
