/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Huy
 */
public class TieuChi {

    private String id; // mã tiêu chí
    private String ten; // tên tiêu chí
    private String noiDung;
    private List<MinhChung> minhChung; // danh sách minh chứng cho tiêu chí này

    public TieuChi() {
               
    }
    
    public TieuChi(String id, String ten, String noiDung) {
        this.id = id;
        this.ten = ten;
        this.noiDung = noiDung;
        this.minhChung = new ArrayList<>();
        
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

    // các phương thức getter và setter cho các thuộc tính của Criterion

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
    
}
