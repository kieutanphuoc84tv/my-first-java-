package Employee;
 
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        int luongTrungBinh = 0, tongLuong = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nhan vien cong ty: ");
        int soNhanVien = scanner.nextInt();
        Employee[] nhanVien = new Employee[soNhanVien];
         
        System.out.println("Nhap thong tin nhan vien");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhap thong tin nhan vien thu: " + (i + 1) + ":");
            System.out.print("chon loai chuc vu nhan vien (1 - lap trinh vien, 2 - kiem chung vien): ");
            int choose = scanner.nextInt();
             
            if (choose == 1) {
                nhanVien[i] = new Employee();
            } else if (choose == 2) {
                nhanVien[i] = new Employee();
            }
             
            nhanVien[i].nhap();
            nhanVien[i].tinhLuong();
        }
         
        System.out.println("Thong tin cua cac nhan vien: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(nhanVien[i].toString());
        }
         
        System.out.println("Danh sach nhan vien luong co muc trung binh "
            + "cac nhan vien cong ty.");
        for (int i = 0; i < soNhanVien; i++) {
            tongLuong += nhanVien[i].tinhLuong();
        }
        luongTrungBinh = tongLuong / soNhanVien;
         
        for (int i = 0; i < soNhanVien; i++) {
            if (nhanVien[i].tinhLuong() <= luongTrungBinh) {
                System.out.println(nhanVien[i].toString());
            }
        }
    }
 
}