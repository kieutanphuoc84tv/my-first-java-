package Employee;
 
public class LapTrinhVien extends Employee {
    private int soGioLamThem;
 
    public LapTrinhVien() {
        super();
    }
 
    public LapTrinhVien(int soGioLamThem) {
        super();
        this.soGioLamThem = soGioLamThem;
    }
 
    public int getSoGioLamThem() {
        return soGioLamThem;
    }
 
    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }
     
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("nhap so gio lam them: ");
        soGioLamThem = scanner.nextInt();
    }
     
    @Override
    public int tinhLuong() {
        this.luong = this.luongCoBan + this.soGioLamThem * 200000;
        return this.luong;
    }
 
    @Override
    public String toString() {
        return super.toString() + "\n, so gio lam them: " + this.soGioLamThem + 
            ", lương: " + this.luong;
    }
}