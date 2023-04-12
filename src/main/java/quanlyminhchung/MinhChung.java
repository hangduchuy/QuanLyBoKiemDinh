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
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Huy
 */
public class MinhChung {

    private String id; // mã minh chứng
    private String ten; // tên minh chứng
    private String noiBanHanh; // cơ quan ban hành minh chứng
    private Date ngayBanHanh; // ngày ban hành minh chứng
    private List<PhongBan> dsPhongBan = new ArrayList<>(); // danh sách các phòng ban chịu trách nhiệm cung cấp minh chứ

    public MinhChung() {

    }

    public MinhChung(String id, String ten, String noiBanHanh, Date ngayBanHanh) {
        this.id = id;
        this.ten = ten;
        this.noiBanHanh = noiBanHanh;
        this.ngayBanHanh = ngayBanHanh;

    }

    public MinhChung(String id, String ten, String noiBanHanh, String ngayBanHanh) throws ParseException {
        this(id, ten, noiBanHanh, f.parse(ngayBanHanh));
    }

    public void hienThi() {
        System.out.printf("%s. %s, %s, %s\n", this.id, this.ten, this.noiBanHanh, f.format(this.ngayBanHanh));
    }

    public ArrayList<PhongBan> timKiemMinhChungTheoPhongBan(String kw) {
        return (ArrayList<PhongBan>) this.dsPhongBan.stream().
                filter(h -> h.getTen().toLowerCase()
                .contains(kw.toLowerCase())).collect(Collectors.toList());
    }
    
//    public List<MinhChung> timKiemMinhChungTheoPhongBan2(String kw) { // timtheo ten
//        return this.dsPhongBan.stream().filter(c -> c.getMinhChung().equals(kw)).collect(Collectors.toList());
//    }
        
    public void themPhongBan(PhongBan... a) {
        this.dsPhongBan.addAll(Arrays.asList(a));
        for (PhongBan x : a) {
            x.setMinhChung(this);
        }
    }

//    public void themPhongBan(String path) throws FileNotFoundException, ParseException {
//        File f = new File(path);
//        try (Scanner sc = new Scanner(f)) {
//            while (sc.hasNext()) {
//                PhongBan m = new PhongBan(sc.nextLine(), sc.nextLine(), sc.nextLine());
//                this.dsPhongBan.add(m);
//            }
//        }
//    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the noiBanHanh
     */
    public String getNoiBanHanh() {
        return noiBanHanh;
    }

    /**
     * @param noiBanHanh the noiBanHanh to set
     */
    public void setNoiBanHanh(String noiBanHanh) {
        this.noiBanHanh = noiBanHanh;
    }

    /**
     * @return the ngayBanHanh
     */
    public Date getNgayBanHanh() {
        return ngayBanHanh;
    }

    /**
     * @param ngayBanHanh the ngayBanHanh to set
     */
    public void setNgayBanHanh(Date ngayBanHanh) {
        this.ngayBanHanh = ngayBanHanh;
    }

    /**
     * @return the dsPhongBan
     */
    public List<PhongBan> getDsPhongBan() {
        return dsPhongBan;
    }

    /**
     * @param dsPhongBan the dsPhongBan to set
     */
    public void setDsPhongBan(List<PhongBan> dsPhongBan) {
        this.dsPhongBan = dsPhongBan;
    }
}
