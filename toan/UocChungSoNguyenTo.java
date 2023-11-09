// bài 6
package  songuyenduong;
import java.util.Scanner;

public class UocChungSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int num1 = scanner.nextInt();

        System.out.print("nhap so thu 2: ");
        int num2 = scanner.nextInt();

        int uocChung = timUocChung(num1, num2);
        System.out.println("uoc chunng cua" + num1 + " va" + num2 + " la: " + uocChung);

        boolean isSoNguyenTo1 = kiemTraSoNguyenTo(num1);
        boolean isSoNguyenTo2 = kiemTraSoNguyenTo(num2);

        if (isSoNguyenTo1) {
            System.out.println(num1 + " la so nguyen to");
        } else {
            System.out.println(num1 + "khong pha la so nguyen to");
        }

        if (isSoNguyenTo2) {
            System.out.println(num2 + " la so nguyen to");
        } else {
            System.out.println(num2 + " khong pha la so nguyen to");
        }
    }

    public static int timUocChung(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static boolean kiemTraSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}