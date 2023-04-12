/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import static cauhinh.CauHinh.f;
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
//    public ArrayList<NhanVien> timKiem(String tuKhoa) {
//        ArrayList<NhanVien> ds = new ArrayList<>();
//        for (NhanVien x : this.danhSachNhanVien) {
//            if (x.getHoTen().toLowerCase().contains(tuKhoa.toLowerCase())) {
//                ds.add(x);
//            }
//        }
//        return ds;
//    }
//    
//    public ArrayList<NhanVien> timKiem(Date ngaySinh) {
//        ArrayList<NhanVien> ds = new ArrayList<>();
//        for (NhanVien x : this.danhSachNhanVien) {
//            if (x.getNgaySinh().compareTo(ngaySinh) == 0) {
//                ds.add(x);
//            }
//        }
//        return ds;
//    }
//
//    public ArrayList<NhanVien> timKiem(PhongBan q) { //phong ban
//        return (ArrayList<NhanVien>) this.danhSachNhanVien.stream().filter(h -> h.getPhongBan().getTenPhongBan().equalsIgnoreCase(q.getTenPhongBan())).collect(Collectors.toList());
//    }
    
    public List<MinhChung> timKiem(String ten) { // timtheo ten
        return this.danhSachMinhChung.stream().filter(c -> c.getTen().equals(ten)).collect(Collectors.toList());
    }
    
    public List<MinhChung> timKiemTheoPhongBan(String tenPhongBan) {
        return this.danhSachMinhChung.stream()
                .filter(mc -> mc.getDsPhongBan().stream()
                        .anyMatch(pb -> pb.getTen().equals(tenPhongBan)))
                .collect(Collectors.toList());
    }    
    
    public List<MinhChung> timMinhChungTheoNoiBanHanh(String ten) { // timtheo ten
        return this.danhSachMinhChung.stream().filter(c -> c.getNoiBanHanh().equals(ten)).collect(Collectors.toList());
    }
    
    public List<MinhChung> timKiem(Date kw) {
        return this.danhSachMinhChung.stream().filter(h -> h.getNgayBanHanh().equals(kw) == true)
                .collect(Collectors.toList());
    }
          
    public void hienThi(){
        this.getDanhSachMinhChung().forEach(v -> v.hienThi());
    }
    
//    public List<MinhChung> timMinhChung (String tenPhongBan) { //tim theo Phong ban chiu trach nhiem
//        
//        return this.danhSachMinhChung.stream().filter(c -> c.getDsPhongBan().equals(tim)).collect(Collectors.toList());
//    }

    
    
    
    
//    public static int quanLyNhanVien(QuanLyMinhChung ql) throws Exception {
//        int choose;
////        do {
//        System.out.println("=== QUAN LY MINH CHUNG ===");
//        System.out.println("1/ Tim kiem theo ten, ngay, noi ban hanh");
//        System.out.println("2/ Tim phong ban cung cap minh chung");
//        System.out.println("3/ Sap xep theo ten");
//        System.out.println("4/ Sap xep theo ngay");
//        System.out.println("5/ Xem danh sach minh chung theo tieu chi");
//        System.out.print("Lua chon cua ban la: ");
//        choose = Integer.parseInt(sc.nextLine());
//
//        switch (choose) {
//            case 1 ->
//                
//            case 2 ->
//                
//            case 3 ->
//                
//            case 4 ->
//                
//            case 5 ->
//               
//            default ->
//                System.out.println("Lua chon khong hop le!");
//        }
//
////        } while (true);
//    }

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
