
// bài 5
package songuyenduong;
import java.util.Scanner;

public class phuongtrinhbac {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("nhap so he bac a = ");
        float a = phuongtrinhbac.scanner.nextFloat();
        System.out.print("nhap so he bac b = ");
        float b = phuongtrinhbac.scanner.nextFloat();
        System.out.print("nhap so he bac c = ");
        float c = scanner.nextFloat();
        phuongtrinhbac.giaiPTBac2(a, b, c);
    }

    public static void giaiPTBac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co 1 nghiem!: " + "x = " + (-c / b));
            }
            return;
        }

        float delta = b * b - 4 * a * c;
        float x1;
        float x2;

        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh co 2 nghiem là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trinh nghiem kep: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
}

