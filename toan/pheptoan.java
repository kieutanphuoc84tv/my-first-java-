
import java.util.Scanner;

public class pheptoan {

    private static String max;
    private static String min;

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        int n;
        int[] a;
        int x;

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhap SPT cua mang :");
        n = ip.nextInt();
        while (n < 0) {
            System.out.print(" Nhap lai SPT (>0):");
            n = ip.nextInt();
        }

        a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap PT thu " + (i + 1) + " :");
            a[i] = ip.nextInt();
        }

        // Tìm phần tử x có trong mảng
        System.out.print("Nhap Phan Tu X :");
        x = ip.nextInt();

        System.out.print("\n Mang vua nhap :");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }

        boolean co = false;
        for (int i = 0; i < n; i++) {
            if (x == a[i]) {
                co = true;
            }
        }

        if (co) {
            System.out.println("\n Phan tu " + x + " co trong mang.");
        } else {
            System.out.println("\n Phan tu " + x + " khong co trong mang.");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap vao mot so: ");
            double number = scanner.nextDouble();
            scanner.close();
    
            if (number > 0.0) {
                System.out.println(number + " la so duong!");
            } else if (number < 0.0) {
                System.out.println(number + " la so am!");
            } else {
                System.out.println(number + "ai bit:v ");
            }
        }
    }
              }



