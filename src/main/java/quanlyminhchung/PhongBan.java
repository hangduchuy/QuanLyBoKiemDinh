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

    public PhongBan(String ten, Date ngayPhongBanCungCapMC, Date ngayTaoMC) {
        this.ten = ten;
        this.ngayPhongBanCungCapMC = ngayPhongBanCungCapMC;
        this.ngayTaoMC = ngayTaoMC;
    }

    public PhongBan(String ten, String ngayPhongBanCungCapMC, String ngayTaoMC) throws ParseException {
        this(ten, f.parse(ngayPhongBanCungCapMC), f.parse(ngayTaoMC));
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
}
