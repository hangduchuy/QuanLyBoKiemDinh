/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import static cauhinh.CauHinh.f;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author Huy
 */
public class PhongBan {
    private String ten;
    private Date ngayPhongBanCungCapMC;
    private Date ngayTaoMC;
    private MinhChung minhChung;

    
    public PhongBan(String ten, Date ngayPhongBanCungCapMC, Date ngayTaoMC, MinhChung minhChung) {
        this.ten = ten;
        this.ngayPhongBanCungCapMC = ngayPhongBanCungCapMC;
        this.ngayTaoMC = ngayTaoMC;
        this.minhChung = minhChung;
    }

    public PhongBan(String ten, String ngayPhongBanCungCapMC, String ngayTaoMC, MinhChung minhChung) throws ParseException {
        this(ten, f.parse(ngayPhongBanCungCapMC), f.parse(ngayTaoMC), minhChung);
    }
       
    public void hienThiPhongBan() {
        System.out.printf("- %s -\n", this.ten.toUpperCase());
        System.out.printf("Ten phong ban: %s\n", this.ten);
        System.out.printf("ngay phong ban cung cap: %s\n", this.ngayPhongBanCungCapMC);
        System.out.printf("ngay tao minh chung: %s\n", this.ngayTaoMC);
    }
    
    public void themMinhChung(MinhChung q) {
        q.themPhongBan(this);
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
     * @return the ngayPhongBanCungCapMC
     */
    public Date getNgayPhongBanCungCapMC() {
        return ngayPhongBanCungCapMC;
    }

    /**
     * @param ngayPhongBanCungCapMC the ngayPhongBanCungCapMC to set
     */
    public void setNgayPhongBanCungCapMC(Date ngayPhongBanCungCapMC) {
        this.ngayPhongBanCungCapMC = ngayPhongBanCungCapMC;
    }

    /**
     * @return the ngayTaoMC
     */
    public Date getNgayTaoMC() {
        return ngayTaoMC;
    }

    /**
     * @param ngayTaoMC the ngayTaoMC to set
     */
    public void setNgayTaoMC(Date ngayTaoMC) {
        this.ngayTaoMC = ngayTaoMC;
    }

    /**
     * @return the minhChung
     */
    public MinhChung getMinhChung() {
        return minhChung;
    }

    /**
     * @param minhChung the minhChung to set
     */
    public void setMinhChung(MinhChung minhChung) {
        this.minhChung = minhChung;
    }
}
