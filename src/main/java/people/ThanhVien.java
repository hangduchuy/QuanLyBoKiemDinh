/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package people;

import static cauhinh.CauHinh.sc;
import static cauhinh.CauHinh.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import quanlyminhchung.MinhChung;

/**
 *
 * @author Huy
 */
public class ThanhVien {
    private String tenThanhVien;
    private String gioiTinh;
    private Date ngaySinh;
    private String quyen;
    private ArrayList<MinhChung> ds = new ArrayList<>();
    /**
     * @return the tenThanhVien
     */
    
    public String getTenThanhVien() {
        return tenThanhVien;
    }

    public ThanhVien() {
    }
    
    public ThanhVien(String tenThanhVien, String gioiTinh, Date ngaySinh,String quyen) {
        this.tenThanhVien = tenThanhVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.quyen=quyen;
    }

    public ThanhVien(String tenThanhVien,String quyen) {
        this.tenThanhVien=tenThanhVien;
        this.quyen=quyen;
    }
    
     public ThanhVien(String tenThanhVien, String gioiTinh, String ngaySinh,String quyen) throws ParseException {
        this(tenThanhVien,gioiTinh,f.parse(ngaySinh),quyen);
    }
    /**
     * @param tenThanhVien the tenThanhVien to set
     */
    public void setTenThanhVien(String tenThanhVien) {
        this.tenThanhVien = tenThanhVien;
    }
    
    public void XoaMinhChung(MinhChung mc){
        this.ds.remove(mc);
    }
     
    public void SuaMinhChung(){
        
    }
    
    public void themMinhChung() throws ParseException{
           /*System.out.print("Tu so = ");
        int t = CauHinh.sc.nextInt();
        System.out.print("Mau so = ");
        int m = CauHinh.sc.nextInt();
        
        PhanSo p = new PhanSo(t, m);
        this.ds.add(p);*/
        System.out.println("Ma minh chung");
        String ma= sc.nextLine();
        System.out.println("Ten minh chung");
        String ten= sc.nextLine();
        System.out.println("Noi ban hanh");
        String noi= sc.nextLine();
        System.out.println("Ngay ban hanh");
        String ngay= sc.nextLine();
        MinhChung a= new MinhChung(ma,ten,noi,ngay);
        this.getDs().add(a);
    }
    
    public void themMinhChung(MinhChung p) {
        this.ds.add(p);
    }
    
    public void themMinhChung(String path) throws FileNotFoundException, ParseException {
        File f = new File(path);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                MinhChung m = new MinhChung(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
                this.ds.add(m);
            }
        }
    }
    
    public void ganMinhChung(){
        
    }
    
    public void baoCaoTieuChuan(){
        
    }
    
    public void hienThi(){
        this.getDs().forEach(x -> x.hienThi()); 
    }
    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }
    
    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the NgaySinh
     */
    public Date getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(Date NgaySinh) {
        this.ngaySinh = NgaySinh;
    }

    /**
     * @return the quyen
     */
    public String getQuyen() {
        return quyen;
    }

    /**
     * @param quyen the quyen to set
     */
    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    /**
     * @return the ds
     */
    public ArrayList<MinhChung> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<MinhChung> ds) {
        this.ds = ds;
    }
}
