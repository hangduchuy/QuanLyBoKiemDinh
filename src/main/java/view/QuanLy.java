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
import quanlyminhchung.BoKiemDinh;
import quanlyminhchung.MinhChung;
import quanlyminhchung.PhongBan;
import quanlyminhchung.PhongDamBaoChatLuong;
import quanlyminhchung.QuanLyMinhChung;

/**
 *
 * @author Huy
 */
public class QuanLy {

    QuanLyMinhChung qlmc = new QuanLyMinhChung();
    private PhongDamBaoChatLuong pdbcl = new PhongDamBaoChatLuong();

    public static void main(String[] args) throws FileNotFoundException, ParseException, Exception {
//        ThanhVien tv = new ThanhVien();
        MinhChung mc = new MinhChung();
        QuanLy q = new QuanLy();       
        BoKiemDinh kd = new BoKiemDinh();
        
//        q.qlmc.themMC("src/main/resources/minhchung.txt");
//        mc.themPhongBan("src/main/resources/phongban.txt");
//        tv.themMinhChung("src/main/resources/minhchung.txt");
        //Minh Chung
        MinhChung mc1 = new MinhChung("1", "Giay chung nhan hoan thanh khoa hoc", "Vo Van Tan", "04/10/2023");
        MinhChung mc2 = new MinhChung("2", "Bang diem va ket qua hoc tap", "Nguyen Kiem", "03/10/2023");
        MinhChung mc3 = new MinhChung("3", "Bao cao va bai tap", "Nguyen Kiem", "06/10/2023");
        MinhChung mc4 = new MinhChung("4", "Phan hoi cua hoc vien va giang vien", "Ho Hao Hon", "02/10/2023");
        MinhChung mc5 = new MinhChung("5", "Danh gia cua nha tuyen dung", "Nguyen Kiem", "03/10/2023");
        MinhChung mc6 = new MinhChung("6", "Tai lieu hoc tap va giao trinh", "Vo Van Tan", "01/10/2023");
        //Phong Ban
        PhongBan pb1 = new PhongBan("Phong dao tao", "04/10/2023", "04/10/2023", mc1);
        PhongBan pb2 = new PhongBan("Phong tuyen dung", "03/10/2023", "03/10/2023", mc1);
        PhongBan pb3 = new PhongBan("Phong chat luong", "05/10/2023", "05/10/2023", mc2);
        PhongBan pb4 = new PhongBan("Phong nhan su", "07/10/2023", "07/10/2023", mc3);
        PhongBan pb5 = new PhongBan("Phong kinh doanh", "08/10/2023", "08/10/2023", mc4);
        PhongBan pb6 = new PhongBan("Phong dao tao", "05/10/2023", "04/10/2023", mc2);
        //
        mc.themPhongBan(pb1, pb2, pb3, pb4, pb5, pb6);
        q.qlmc.themMC(mc1, mc2, mc3, mc4, mc5, mc6);

        int luaChon;
        do {
            System.out.println("=============MENU==============");
            System.out.println(
                    "1. Them bo kiem dinh\n"
                    + "2. Them tieu chuan\n"
                    + "3. Them tieu chi\n"
                    + "4. Phan quyen cho thanh vien\n"
                    + "5. Cap quyen cho thanh vien\n"
                    + "6. Quan ly thanh vien\n"
                    + "7. Quan ly minh chung\n"
                    + "0. Thoat chuong trinh");
            System.out.println("Vui long chon chuc nang: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1 -> {
                    kd.nhapBoKiemDinh();
//                    this.pdbcl.themBoKiemDinh(kd);
                    System.out.println("Them bo kiem dinh thanh cong");
                }
                case 2 -> {

                }
                case 3 -> {
                    
                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {
                    quanLyThanhVien(q);
                }
                case 7 -> {
                    quanLyMinhChung(q);
                }

            }
        } while (luaChon != 0);

    }

    public static void quanLyThanhVien(QuanLy q) {
        int luaChon;
        do {
            System.out.println("=============MENU==============");
            System.out.println(
                    "1. Truong phong cap quyen\n"
                    + "2. Xem quyen cua giang vien\n"
                    + "3. Xem quyen cua nhan vien\n"
                    + "0. Quay lai");
            System.out.println("Vui long chon chuc nang: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {

                }
            }
        } while (luaChon != 0);
    }

    public static void quanLyMinhChung(QuanLy q) throws Exception {
        int luaChon;
        do {
            System.out.println("=============MENU==============");
            System.out.println(
                    "1. Tim minh chung\n"
                    + "2. Sap xep cac minh chung theo ngay\n"
                    + "3. Sap xep cac minh chung theo ten\n"
                    + "0. Quay lai");
            System.out.println("Vui long chon chuc nang: ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1 -> {
                    q.timKiemMinhChung();
                }              

                case 2 -> {
                    System.out.println("Ket qua sap xep: ");
                    q.qlmc.sapXep();
                    q.qlmc.hienThi();
                }

                case 3 -> {
                    System.out.println("Ket qua sap xep: ");
                    q.qlmc.sapXep2();
                    q.qlmc.hienThi();
                }
            }
        } while (luaChon != 0);
    }

    public void timKiemMinhChung() throws Exception {
        if (this.qlmc.getDanhSachMinhChung().isEmpty()) {
            System.out.println("Danh sach minh chung rong!");
        } else {
            System.out.println("Tim kiem minh chung theo:");
            System.out.println(" 1/ ten");
            System.out.println(" 2/ Ngay Ban Hanh");
            System.out.println(" 3/ Noi Ban Hanh");
            System.out.println(" 4/ Phong ban cung cap minh chung");
            System.out.print("Lua chon cua ban la: ");

            int luaChon = sc.nextInt();
            switch (luaChon) {

                case 1 -> {
                    System.out.print("Nhap ten: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    if (this.qlmc.timKiem(name).isEmpty()) {
                        System.out.println("Khong tim thay minh chung!");
                    } else {
                        this.qlmc.timKiem(name).forEach(h -> h.hienThi());
                    }
                }

                case 2 -> {
                    System.out.print("Nhap ngay sinh: ");
                    sc.nextLine();
                    Date birth = f.parse(sc.nextLine());

                    if (this.qlmc.timKiem(birth).isEmpty()) {
                        System.out.println("Khong tim thay minh chung!");
                    } else {
                        this.qlmc.timKiem(birth).forEach(h -> h.hienThi());
                    }
                }

                case 3 -> {
                    System.out.print("Nhap noi ban hanh: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    if (this.qlmc.timMinhChungTheoNoiBanHanh(name).isEmpty()) {
                        System.out.println("Khong tim thay minh chung!");
                    } else {
                        this.qlmc.timMinhChungTheoNoiBanHanh(name).forEach(h -> h.hienThi());
                    }
                }

                case 4 -> {
                    System.out.print("Nhap ten phong ban cung cap: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    if (this.qlmc.timKiemTheoPhongBan(name).isEmpty()) {
                        System.out.println("Khong tim thay minh chung!");
                    } else {
                        this.qlmc.timKiemTheoPhongBan(name).forEach(h -> h.hienThi());
                    }
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

    /**
     * @return the pdbcl
     */
    public PhongDamBaoChatLuong getPdbcl() {
        return pdbcl;
    }

    /**
     * @param pdbcl the pdbcl to set
     */
    public void setPdbcl(PhongDamBaoChatLuong pdbcl) {
        this.pdbcl = pdbcl;
    }

}
