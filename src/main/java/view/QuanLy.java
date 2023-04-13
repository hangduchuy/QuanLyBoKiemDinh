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
import quanlyminhchung.TieuChi;
import quanlyminhchung.TieuChuan;

/**
 *
 * @author Huy
 */
public class QuanLy {

    QuanLyMinhChung qlmc = new QuanLyMinhChung();
    PhongDamBaoChatLuong pdbcl = new PhongDamBaoChatLuong();

    public static void main(String[] args) throws FileNotFoundException, ParseException, Exception {
//        ThanhVien tv = new ThanhVien();
        
        MinhChung mc = new MinhChung();
        QuanLy q = new QuanLy();       
        BoKiemDinh bkd = new BoKiemDinh();
        TieuChuan tchuan = new TieuChuan();
        TieuChi tchi = new TieuChi();
        
//        q.qlmc.themMC("src/main/resources/minhchung.txt");
//        mc.themPhongBan("src/main/resources/phongban.txt");
//        tv.themMinhChung("src/main/resources/minhchung.txt");
        
        //Bo Kiem Dinh
        BoKiemDinh bkd1 = new BoKiemDinh("MOET", "cong nghe thong tin");
        
        //TieuChuan
        TieuChuan tchuan1 = new TieuChuan("chuong trình va hoat dong giang day", "chuong trinh giang day, hoat dong ngoai khoa, hoat dong tu van va huong nghiep", bkd1);
        TieuChuan tchuan2 = new TieuChuan("giao vien va nhan vien", "quyen va nghia vu cua giao vien, quyen va nghia va cua nhan vien, danh gia nang luc va nang luc phat trien", bkd1);
        TieuChuan tchuan3 = new TieuChuan("danh gia va dam bao chat luong", "danh gia va dam bao chat luong giao duc, tieu chuan danh gia va kiem dinh ngoai, giam sat va phan hoi", bkd1);

        //Tieu Chi
        TieuChi tc1 = new TieuChi("Tieu chi dao tao", "Danh gia chat luong dao tao cua khoa bao gom cac hoat dong giang day, huong dan, hoc tap va kiem tra danh gia ket qua hoc tap cua sinh vien", tchuan1);
        TieuChi tc2 = new TieuChi("Tieu chi ve doi ngu giang vien", "Danh gia chat luong doi ngu giang vien cua khoa, bao gom trinh do, kinh nghiem, nang luc giang day va nghien cuu khoa hoc, " 
                +"cung nhu cac hoat dong ho tro sinh vien va cac hoat dong khac cua giang vien.", tchuan1);
        TieuChi tc3 = new TieuChi("Tieu chi ve co so vat chat va trang thiet bi", "Danh gia chat luong co so vat chat va trang thiet bi cua khoa, bao gom day du, dap ung nhu cau cua hoat dong " 
                +"dao tao va nghien cuu khoa học cua khoa.", tchuan2);
        TieuChi tc4 = new TieuChi("Tieu che ve cac hoat dong ho tro sinh vien", "Danh gia chat", tchuan3);       
        
        //Minh Chung
        MinhChung mc1 = new MinhChung("Giay chung nhan hoan thanh khoa hoc", "Vo Van Tan", "04/10/2023");
        MinhChung mc2 = new MinhChung("Bang diem va ket qua hoc tap", "Nguyen Kiem", "03/10/2023");
        MinhChung mc3 = new MinhChung("Bao cao va bai tap", "Nguyen Kiem", "06/10/2023");
        MinhChung mc4 = new MinhChung("Phan hoi cua hoc vien va giang vien", "Ho Hao Hon", "02/10/2023");
        MinhChung mc5 = new MinhChung("Danh gia cua nha tuyen dung", "Nguyen Kiem", "03/10/2023");
        MinhChung mc6 = new MinhChung("Tai lieu hoc tap va giao trinh", "Vo Van Tan", "01/10/2023");
        
        //Phong Ban
        PhongBan pb1 = new PhongBan("Phong dao tao", "04/10/2023", "04/10/2023", mc1);
        PhongBan pb2 = new PhongBan("Phong tuyen dung", "03/10/2023", "03/10/2023", mc1);
        PhongBan pb3 = new PhongBan("Phong chat luong", "05/10/2023", "05/10/2023", mc2);
        PhongBan pb4 = new PhongBan("Phong nhan su", "07/10/2023", "07/10/2023", mc3);
        PhongBan pb5 = new PhongBan("Phong kinh doanh", "08/10/2023", "08/10/2023", mc4);
        PhongBan pb6 = new PhongBan("Phong dao tao", "05/10/2023", "04/10/2023", mc2);      

        q.pdbcl.themBoKiemDinh(bkd1);
        bkd.themTieuChuan(tchuan1, tchuan2, tchuan3);
        tchuan.themTieuChi(tc1, tc2, tc3, tc4);       
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
                    bkd.nhapBoKiemDinh();
                    q.pdbcl.themBoKiemDinh(bkd);                  
                    System.out.print("Them bo kiem dinh thanh cong\n");
                    System.out.print("==Danh sach tieu chuan==\n");
                    q.pdbcl.hienThiBoKiemDinh();
                }
                case 2 -> {
                    tchuan.nhapTieuChuan();
                    bkd.themTieuChuan(tchuan);
                    System.out.print("Them tieu chuan thanh cong\n");
                    System.out.print("==Danh sach tieu chuan==\n");
                    bkd.hienThiTieuChuan();
                } 
                case 3 -> {
                    tchi.nhapTieuChi();
                    tchuan.themTieuChi(tchi);
                    System.out.print("Them tieu chi thanh cong\n");
                    System.out.print("==Danh sach tieu chi==\n");
                    tchuan.hienThiTieuChi();
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
