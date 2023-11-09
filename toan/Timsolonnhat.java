// bài 4


package songuyenduong;
import java.util.Scanner;

public class Timsolonnhat {

  public static void main(String[] args) {
    // Nhập vào 4 số nguyên dương
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so nguyen duong a: ");
    int a = scanner.nextInt();
    System.out.println("Nhap so nguyen duong b: ");
    int b = scanner.nextInt();
    System.out.println("Nhap so nguyen duong c: ");
    int c = scanner.nextInt();
    System.out.println("Nhap so nguyen duong d: ");
    int d = scanner.nextInt();

    // Tìm số lớn nhất
    int maxSo = a;
    if (b > maxSo) {
      maxSo = b;
    }
    if (c > maxSo) {
      maxSo = c;
    }
    if (d > maxSo) {
      maxSo = d;
    }

    // In ra số lớn nhất
    System.out.println("so lon nhat la: " + maxSo);
  }
}
