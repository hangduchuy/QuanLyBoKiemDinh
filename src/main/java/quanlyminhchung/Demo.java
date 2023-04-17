/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import static cauhinh.CauHinh.sc;
import java.io.FileNotFoundException;
import people.ThanhVien;
import java.text.ParseException;
import people.TruongPhong;

/**
 *
 * @author Nguyen Tuan Du
 */
public class Demo {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        MinhChung mc1 = new MinhChung("Giay chung nhan hoan thanh khoa hoc", "Vo Van Tan", "04/10/2023");
//        MinhChung mc2 = new MinhChung("Bang diem va ket qua hoc tap", "Nguyen Kiem", "03/10/2023");
//        MinhChung mc3 = new MinhChung("Bao cao va bai tap", "Nguyen Kiem", "06/10/2023");
//        MinhChung mc4 = new MinhChung("Phan hoi cua hoc vien va giang vien", "Ho Hao Hon", "02/10/2023");
//        MinhChung mc5 = new MinhChung("Danh gia cua nha tuyen dung", "Nguyen Kiem", "03/10/2023");
//        MinhChung mc6 = new MinhChung("Tai lieu hoc tap va giao trinh", "Vo Van Tan", "01/10/2023");
        //Phong Ban
//        PhongBan pb1 = new PhongBan("Phong dao tao", "04/10/2023", "04/10/2023", mc1);
//        PhongBan pb2 = new PhongBan("Phong tuyen dung", "03/10/2023", "03/10/2023", mc1);
//        PhongBan pb3 = new PhongBan("Phong chat luong", "05/10/2023", "05/10/2023", mc2);
//        PhongBan pb4 = new PhongBan("Phong nhan su", "07/10/2023", "07/10/2023", mc3);
//        PhongBan pb5 = new PhongBan("Phong kinh doanh", "08/10/2023", "08/10/2023", mc4);
//        //
//        QuanLyMinhChung qlmc = new QuanLyMinhChung();
//        MinhChung mc = new MinhChung();
//        mc.themPhongBan(pb1, pb2, pb3, pb4, pb5);
//        qlmc.themMC(mc1, mc2, mc3, mc4, mc5, mc6);

//        MinhChung mc = new MinhChung("01", "HiHi", "QuangNgai", "02/12/2002");
//        MinhChung mc2 = new MinhChung("01", "HiHi", "QuangNAm", "02/12/2002");
//        ThanhVien tv = new ThanhVien();
//        QuanLyMinhChung qlmc = new QuanLyMinhChung();
//       tv.themMinhChung();
//        tv.themMinhChung("src/main/resources/minhchung.txt");
//        qlmc.themMC("src/main/resources/minhchung.txt");
//        System.out.print("Nhap ten: ");
//        String name = sc.nextLine();
//        if (qlmc.timKiemTheoPhongBan(name).isEmpty()) {
//            System.out.println("Khong tim thay minh chung!");
//        } else {
//            qlmc.timKiemTheoPhongBan(name).forEach(h -> h.hienThi());
//        }
//        qlmc.sapXep();
//        qlmc.hienThi();
        /*QuanLyCongDan qlcd = new QuanLyCongDan();
            qlcd.themCd(c1, c2, c3, c4);
            System.out.println("==========");
            qlcd.TimCdNN().forEach(c -> c.hienThi());*/
//
//        qlmc.themMC(mc, mc2);
//        System.out.println("\n==========");
//       qlmc.timMinhChung().forEach(c->c.hienThi());
        PhongDamBaoChatLuong pdb = new PhongDamBaoChatLuong();
        BoKiemDinh bk = new BoKiemDinh("MOEE", "Khoa hoc may tinh");
        TruongPhong john = new TruongPhong("john");
        TruongPhong john1 = new TruongPhong("john1");
        ThanhVien john2=new ThanhVien("John2", "Bao cao");
        //pdb.CapQuyenThanhVien(john2);
        john1.themBoKiemDinh(bk);
        //pdb.CapQuyenThanhVien(john);
        //john1.themBoKiemDinh(bk);
        pdb.hienThiBoKiemDinh();
        //john1.themBoKiemDinh(bk);
        //john1.hienThiBoKiemDinh();
    }
}
