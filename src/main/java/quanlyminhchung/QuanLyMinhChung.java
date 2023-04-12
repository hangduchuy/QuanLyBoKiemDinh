/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Huy
 */
public class QuanLyMinhChung {
    private List<MinhChung> danhSachMinhChung = new ArrayList<>();
    
    public void themMC(MinhChung... a) {
        this.getDanhSachMinhChung().addAll(Arrays.asList(a));
    }
    
    public void themMC(ArrayList<MinhChung> ds) {
        this.getDanhSachMinhChung().addAll(ds);
    }
    
    public void themMC(String path) throws FileNotFoundException, ParseException {
        File f = new File(path);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                MinhChung m = new MinhChung(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
                this.danhSachMinhChung.add(m);
            }
        }
    }
    
    public void sapXep(){
        this.danhSachMinhChung.sort(Comparator.comparing(MinhChung::getNgayBanHanh)
                .thenComparing(MinhChung::getTen, Comparator.reverseOrder()));
    }
    
    public void sapXep2(){
        this.danhSachMinhChung.sort(Comparator.comparing(MinhChung::getTen)
                .thenComparing(MinhChung::getTen, Comparator.reverseOrder()));
    }
    
    public List<MinhChung> timKiem(String ten) { // timtheo ten
        return this.danhSachMinhChung.stream()
                .filter(c -> c.getTen().toLowerCase().contains(ten.toLowerCase()))
                .collect(Collectors.toList());       
    }
    
    public List<MinhChung> timKiem(Date kw) {
        return this.danhSachMinhChung.stream().filter(h -> h.getNgayBanHanh().equals(kw) == true)
                .collect(Collectors.toList());
    }
    
    public List<MinhChung> timMinhChungTheoNoiBanHanh(String ten) { // tim theo noi ban hanh
        return this.danhSachMinhChung.stream()
                .filter(c -> c.getNoiBanHanh().toLowerCase().contains(ten.toLowerCase()))
                .collect(Collectors.toList());
    } 
    
    public List<MinhChung> timKiemTheoPhongBan(String tenPhongBan) {
        return this.danhSachMinhChung.stream()
                .filter(mc -> mc.getDsPhongBan().stream()
                        .anyMatch(pb -> pb.getTen().contains(tenPhongBan)))
                .collect(Collectors.toList());
    }
       
//    public void timKiemTheoTenHoacPhongBan(List<MinhChung> dsMinhChung, String a) {
//        boolean timKiem = false;
//        for (MinhChung mc : dsMinhChung) {
//            if (mc.getTen().toLowerCase().contains(a.toLowerCase()) || mc.getDsPhongBan().toLowerCase().contains(a.toLowerCase())) {
//                mc.hienThi();
//                timKiem = true;
//            }
//        }
//        if (timKiem == false) {
//            System.out.println("Khong tim thay !!!");
//        }
//
//    }
                
    public void hienThi(){
        this.getDanhSachMinhChung().forEach(v -> v.hienThi());
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
}
