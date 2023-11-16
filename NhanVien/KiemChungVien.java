package Employee;
 
public class KiemChungVien extends Employee {
    private int soLoiPhatHien;
 
    public KiemChungVien() {
        super();
    }
 
    public KiemChungVien(int soLoiPhatHien) {
        super();
        this.soLoiPhatHien = soLoiPhatHien;
    }
 
    public int getSoLoiPhatHien() {
        return soLoiPhatHien;
    }
 
    public void setSoLoiPhatHien(int soLoiPhatHien) {
        this.soLoiPhatHien = soLoiPhatHien;
    }
 
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập so loi phat hien: ");
        soLoiPhatHien = scanner.nextInt();
    }
 
    @Override
    public int tinhLuong() {
        this.luong = this.luongCoBan + this.soLoiPhatHien * 50000;
        return this.luong;
    }
 
    @Override
    public String toString() {
        return super.toString() + "\n, so loi phat hien: " + this.soLoiPhatHien + 
            ", lương: " + this.luong;
    }
     
}