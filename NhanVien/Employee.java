package Employee;
 
import java.util.Scanner;
 
public class Employee {
    private String maNhanVien, hoTen, soDienThoai, mail;
    private int tuoi;
    protected int luong, luongCoBan;
    Scanner scanner = new Scanner(System.in);
     
    public Employee() {
        super();
    }
 
    public Employee(String maNhanVien, String hoTen, String soDienThoai, String mail, int tuoi, 
        int luong, int luongCoBan) {
        super();
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.mail = mail;
        this.tuoi = tuoi;
        this.luong = luong;
        this.luongCoBan = luongCoBan;
    }
 
    public String getMaNhanVien() {
        return maNhanVien;
    }
 
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
 
    public String getHoTen() {
        return hoTen;
    }
 
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
 
    public String getSoDienThoai() {
        return soDienThoai;
    }
 
    public int getTuoi() {
        return tuoi;
    }
 
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
 
    public int getLuong() {
        return luong;
    }
 
    public void setLuong(int luong) {
        this.luong = luong;
    }
 
    public int getLuongCoBan() {
        return luongCoBan;
    }
 
    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
     
    public void nhap() {
        System.out.print("Nhap ma nhan vien: ");
        maNhanVien = scanner.nextLine();
        System.out.print("Nhap ho ten nhan vien: ");
        hoTen = scanner.nextLine();
        mail = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = scanner.nextInt();
        System.out.print("Nhap luong co ban: ");
        luongCoBan = scanner.nextInt();
    }
     
    public int tinhLuong() {
        return 0;
    }
     
    @Override
    public String toString() {
        return "Ma nhân viên: " + this.maNhanVien + ", họ tên nhân viên: " + this.hoTen + 
            ", tuổi: " + this.tuoi + ", lương cơ bản: " + this.luongCoBan;
    }
}
