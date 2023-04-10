/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

//import java.util.Date;

import static cauhinh.CauHinh.f;
import static cauhinh.CauHinh.sc;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import people.ThanhVien;
import quanlyminhchung.MinhChung;
import quanlyminhchung.QuanLyMinhChung;






/**
 *
 * @author Huy
 */
public class QuanLy {
    
    private QuanLyMinhChung qlmc = new QuanLyMinhChung();
    
    public static void main(String[] args) throws FileNotFoundException, ParseException, Exception {
        ThanhVien tv = new ThanhVien();
        MinhChung mc = new MinhChung();
        QuanLy q = new QuanLy();      
        
        q.qlmc.themMC("src/main/resources/minhchung.txt");
//        mc.themPhongBan("src/main/resources/phongban.txt");
        tv.themMinhChung("src/main/resources/minhchung.txt");
        
        int luaChon;
        do  {
            System.out.println("=============MENU==============");
            System.out.println(
                    "1. Phan quyen cho thanh vien\n"
                  + "2. Cap quyen cho thanh vien\n"
                  + "3. Them bo kiem dinh\n"
                  + "4. Them tieu chuan\n"
                  + "5. Them tieu chi\n"
                  + "6. Quan ly thanh vien\n"
                  + "7. Quan ly minh chung\n"         
                  + "0. Thoat chuong trinh");
            System.out.println("Vui long chon chuc nang: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1 ->  {
                    
                }
                case 2 ->  {
                    
                }
                case 3 ->  {
                    
                }
                case 4 -> {
                    
                }
                case 5 -> {
                    
                }
                case 6 ->  {
                    quanLyThanhVien(q);
                }
                case 7 ->  {
                    quanLyMinhChung(q);
                }
                                              
            }      
        }while(luaChon != 0);
        
    }
    
    public static void quanLyThanhVien(QuanLy q){
       int luaChon;
        do  {
            System.out.println("=============MENU==============");          
            System.out.println(
                    "1. Truong phong cap quyen\n"
                  + "2. Xem quyen cua giang vien\n"
                  + "3. Xem quyen cua nhan vien\n"                         
                  + "0. Quay lai");
            System.out.println("Vui long chon chuc nang: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1 ->  {
                    
                }
                case 2 ->  {
                    
                }
                case 3 ->  {
                    
                }                                     
            }      
        }while(luaChon != 0); 
    }
    
    public static void quanLyMinhChung(QuanLy q) throws Exception{
        int luaChon;
        do  {
            System.out.println("=============MENU==============");          
            System.out.println(
                    "1. Tim minh chung theo ten, co quan, ngay\n"
                  + "2. Tim cac minh chung theo phong ban cung cap\n"                                        
                  + "0. Quay lai");
            System.out.println("Vui long chon chuc nang: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1 ->  {
                    q.timKiemMinhChung();
                }
                case 2 ->  {
                    
                }
                
            }      
        }while(luaChon != 0); 
    }
    
    public void timKiemMinhChung() throws Exception {
        if (this.getQlmc().getDanhSachMinhChung().isEmpty()) {
            System.out.println("Danh sach minh chung rong!");
        } else {
            
            System.out.println("Tim kiem minh chung theo:");
            System.out.println(" 1/ ten");
            System.out.println(" 2/ Ngay Ban Hanh");
            System.out.println(" 3/ Noi Ban Hanh");
            System.out.print("Lua chon cua ban la: ");
            
            int luaChon = sc.nextInt();
            switch (luaChon) {
                
                case 1: {
                    System.out.print("Nhap ho ten: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    
                    if (this.qlmc.timKiem(name).isEmpty()) {
                        System.out.println("Khong tim thay minh chung!");
                    } else {
                        this.qlmc.timKiem(name).forEach(h -> h.hienThi());
                    }
                }
                case 2: {
//                    System.out.print("Nhap ngay sinh: ");
//                    Date birth = f.parse(sc.nextLine());
//                    this.nhanVien.timKiem(birth).forEach(h -> h.hienThiNhanVien());
                }
                case 3: {
//                    if (this.phongBan.getDanhSachPhongBan().isEmpty()) {
//                        System.out.println("Phong ban chua duoc cap nhap");
//                    } else {
//                        System.out.print("Nhap ten phong ban can tim kiem: ");
//                        String name = sc.nextLine();
//                        System.out.println("Ket qua tim kiem la: ");
//                        this.phongBan.timKiem(name).forEach(h -> h.getNhanVienTrucThuoc().forEach(g -> g.hienThiNhanVien()));
//                    }
                }              
            }
            
                
        }
    }

    /**
     * @return the qlmc
     */
    public QuanLyMinhChung getQlmc() {
        return qlmc;
    }

    /**
     * @param qlmc the qlmc to set
     */
    public void setQlmc(QuanLyMinhChung qlmc) {
        this.qlmc = qlmc;
    }
}
       

