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
class TieuChuan {
    private String id;
    private String ten;
    private String ndTienChuan;
    private List<TieuChi> dsTieuChi;

    public TieuChuan(String id, String ten, String ndTienChuan) {
        this.id = id;
        this.ten = ten;
        this.ndTienChuan = ndTienChuan;
        this.dsTieuChi = new ArrayList<>();
    }
    public void themTieuChi(TieuChi tieuChi) {
        this.dsTieuChi.add(tieuChi);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    public List<TieuChi> getDanhSachTieuChi() {
        return dsTieuChi;
    }

    public void setDanhSachTieuChi(ArrayList<TieuChi> danhSachTieuChi) {
        this.dsTieuChi = danhSachTieuChi;
    }

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
     * @return the ndTienChuan
     */
    public String getNdTienChuan() {
        return ndTienChuan;
    }

    /**
     * @param ndTienChuan the ndTienChuan to set
     */
    public void setNdTienChuan(String ndTienChuan) {
        this.ndTienChuan = ndTienChuan;
    }
}
