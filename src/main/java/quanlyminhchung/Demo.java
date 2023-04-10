/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import static cauhinh.CauHinh.sc;
import java.io.FileNotFoundException;
import people.ThanhVien;
import java.text.ParseException;

/**
 *
 * @author Nguyen Tuan Du
 */
public class Demo {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        /*PhanSo p1 = new PhanSo(1, 2);
        PhanSo p2 = new PhanSo(3, -4);
        PhanSo p3 = new PhanSo(-5, 8);
        PhanSo p4 = new PhanSo(3, 5);
        
        DsPhanSo ql = new DsPhanSo();
        ql.themPhanSo(p1);
        ql.themPhanSo(p2, p3, p4);
        ql.themPhanSo();
        
        ql.xoaPhanSo(-5, 8);
        ql.hienThi();*/
        MinhChung mc = new MinhChung("01", "HiHi", "QuangNgai", "02/12/2002");
        MinhChung mc2 = new MinhChung("01", "HiHi", "QuangNAm", "02/12/2002");
        ThanhVien tv = new ThanhVien();
        QuanLyMinhChung qlmc = new QuanLyMinhChung();

//       tv.themMinhChung();
        tv.themMinhChung("src/main/resources/minhchung.txt");
        qlmc.themMC("src/main/resources/minhchung.txt");

        System.out.print("Nhap ho ten: ");
        String name = sc.nextLine();
        if (qlmc.timKiem(name).isEmpty()) {
            System.out.println("Khong tim thay minh chung!");
        } else {
            qlmc.timKiem(name).forEach(h -> h.hienThi());
        }
//        qlmc.sapXep();
//        qlmc.hienThi();
        /*QuanLyCongDan qlcd = new QuanLyCongDan();
            qlcd.themCd(c1, c2, c3, c4);
            System.out.println("==========");
            qlcd.TimCdNN().forEach(c -> c.hienThi());*/

        qlmc.themMC(mc, mc2);
        System.out.println("\n==========");
//       qlmc.timMinhChung().forEach(c->c.hienThi());
    }

    
}
