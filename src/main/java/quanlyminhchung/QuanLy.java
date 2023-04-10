/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyminhchung;

/**
 *
 * @author Huy
 */
public class QuanLy {
    private QuanLyMinhChung minhChung = new QuanLyMinhChung();
    private PhongDamBaoChatLuong phongChatLuong = new PhongDamBaoChatLuong();

    
    
    /**
     * @return the minhChung
     */
    public QuanLyMinhChung getMinhChung() {
        return minhChung;
    }

    /**
     * @param minhChung the minhChung to set
     */
    public void setMinhChung(QuanLyMinhChung minhChung) {
        this.minhChung = minhChung;
    }

    /**
     * @return the phongChatLuong
     */
    public PhongDamBaoChatLuong getPhongChatLuong() {
        return phongChatLuong;
    }

    /**
     * @param phongChatLuong the phongChatLuong to set
     */
    public void setPhongChatLuong(PhongDamBaoChatLuong phongChatLuong) {
        this.phongChatLuong = phongChatLuong;
    }
}
