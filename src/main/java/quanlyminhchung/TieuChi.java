/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import static cauhinh.CauHinh.f;
import static cauhinh.CauHinh.sc;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Huy
 */
public class TieuChi {
    
    private static int dem = 0;
    private int id; // mã tiêu chí
    private String ten; // tên tiêu chí
    private String noiDung;
    private TieuChuan tieuChuan;
    private List<MinhChung> minhChung; // danh sách minh chứng cho tiêu chí này

    {
        dem++;
        this.setId(dem);
    }
    
    public TieuChi() {
               
    }
    
    public TieuChi(String ten, String noiDung, TieuChuan tieuChuan) {
        this.ten = ten;
        this.noiDung = noiDung;
        this.minhChung = new ArrayList<>();
        this.tieuChuan = tieuChuan;
        
        this.tieuChuan.getDanhSachTieuChi().add(this);
    }   

    public void nhapTieuChi(){
        System.out.print("Nhap ten tieu chi: ");
        sc.nextLine();
        this.ten = sc.nextLine();
        System.out.print("Nhap noi dung: ");
        this.noiDung = sc.nextLine();
    }
    
    public void addMinhChung(MinhChung minhChung) {
        this.minhChung.add(minhChung);
    }

    public void xoaMinhChung(MinhChung minhChung) {
        this.minhChung.remove(minhChung);
    }

   
    
//    public void capNhatMinhChung(MinhChung minhChung, String tenMoi, Date ngayBanHanhMoi) {
//        // tìm kiếm minh chứng trong danh sách
//        int index = MinhChung.indexOf(minhchung);
//        if (index != -1) {
//            // cập nhật thông tin của minh chứng
//            minhchung.get(index).setTen(tenMoi);
//            minhchung.get(index).setNgayBanHanh(ngayBanHanhMoi);
//        }
//    }

    public List<MinhChung> timKiemMinhChung(String tuKhoa) {
        List<MinhChung> ketQua = new ArrayList<>();
        for (MinhChung minhchung : minhChung) {
            if (minhchung.getTen().contains(tuKhoa)) {
                ketQua.add(minhchung);
            }
        }
        return ketQua;
    }

    public void hienThi() {      
        System.out.printf("%s. %s, %s\n", this.id, this.ten, this.noiDung);
    }
    
    // các phương thức getter và setter cho các thuộc tính của Criterion

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the minhChung
     */
    public List<MinhChung> getMinhChung() {
        return minhChung;
    }

    /**
     * @param minhChung the minhChung to set
     */
    public void setMinhChung(List<MinhChung> minhChung) {
        this.minhChung = minhChung;
    }

    /**
     * @return the tieuChuan
     */
    public TieuChuan getTieuChuan() {
        return tieuChuan;
    }

    /**
     * @param tieuChuan the tieuChuan to set
     */
    public void setTieuChuan(TieuChuan tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    
    
}
