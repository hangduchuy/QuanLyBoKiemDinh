/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

import people.ThanhVien;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import quanlyminhchung.BoKiemDinh;
import quanlyminhchung.TieuChi;
import quanlyminhchung.TieuChuan;

/**
 *
 * @author Huy
 */
public class TruongPhong extends ThanhVien  {
    public TruongPhong(String ten) throws ParseException{
        super(ten,"Truong phong");
    }
    
    public void capQuyenNhanVien(NhanVien nv){
        
    }
    public void capQuyenGiangVien(GiangVien gv){
        
    }
    private List<BoKiemDinh> boKiemDinh = new ArrayList<>();
    private List<TieuChuan> dsTieuChuan = new ArrayList<>();
    private List<TieuChi> dsTieuChi = new ArrayList<>();
    @Override
    public void themBoKiemDinh(BoKiemDinh a){
        this.getBoKiemDinh().add(a);
    }
    
    /**
     * @param boKiemDinh the boKiemDinh to set
     */
    @Override
    public void setBoKiemDinh(List<BoKiemDinh> boKiemDinh) {
        this.boKiemDinh = boKiemDinh;
    }  

    /**
     * @return the boKiemDinh
     */
    @Override
    public List<BoKiemDinh> getBoKiemDinh() {
        return boKiemDinh;
    }
    @Override
    public void themTieuChuan(TieuChuan a){
         this.getDsTieuChuan().add(a);
     }

    /**
     * @return the dsTieuChuan
     */
    @Override
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
     * @return the dsTieuChi
     */
    @Override
    public List<TieuChi> getDsTieuChi() {
        return dsTieuChi;
    }

    /**
     * @param dsTieuChi the dsTieuChi to set
     */
    @Override
    public void setDsTieuChi(List<TieuChi> dsTieuChi) {
        this.dsTieuChi = dsTieuChi;
    }
    
    
}
