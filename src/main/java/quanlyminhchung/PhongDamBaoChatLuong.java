/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Huy
 */
public class PhongDamBaoChatLuong {
    
    private List<BoKiemDinh> boKiemDinh = new ArrayList<>();

    public PhongDamBaoChatLuong() {
        this.boKiemDinh = new ArrayList<>();
    }
    
    public void themBoKiemDinh(BoKiemDinh... a) {
        this.boKiemDinh.addAll(Arrays.asList(a));  
    }
    
    public void themBoKiemDinh(ArrayList<BoKiemDinh> ds) {
        this.boKiemDinh.addAll(ds);
    }
    
    public void hienThiBoKiemDinh(){
        this.getBoKiemDinh().forEach(v -> v.hienThi());
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
     * @return the boKiemDinh
     */
    
}
