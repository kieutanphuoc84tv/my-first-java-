package songuyenduong;

import java.util.Scanner;

     

//bai 1

public class Songuyenduong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



           Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println("tong cac day so S = 1 + 2 + 3 + ... + " + n + " la: " + sum);

        // Nhập các số a, b, c
        System.out.print("Nhap so a: ");
        double a = input.nextDouble();

        System.out.print("Nhap so b: ");
        
        double b = input.nextDouble();

        System.out.print("Nhap so c: ");
        double c = input.nextDouble();
// bài 3 (này do thầy ghi và 2 bài 1 và 3 làm chung 1 code)
        // Kiểm tra xem a, b, c có lập thành 3 cạnh của một tam giác hay không
        if (isTriangle(a, b, c)) {
            // Xác định loại tam giác
            if (isEquilateralTriangle(a, b, c)) {
                System.out.println("Tam giac deu");
            } else if (isIsoscelesTriangle(a, b, c)) {
                System.out.println("Tam giac can");
            } else if (isRightTriangle(a, b, c)) {
                System.out.println("Tam giac vuong");
            } else if (isRightIsoscelesTriangle(a, b, c)) {
                System.out.println("Tam giac vuong can");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("3 so khong lap thanh canh cua tam giac");
        }
    }

    // Phương thức kiểm tra xem a, b, c có lập thành 3 cạnh của một tam giác hay không
    public static boolean isTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Phương thức kiểm tra xem tam giác có là tam giác đều hay không
    public static boolean isEquilateralTriangle(double a, double b, double c) {
        return a == b && b == c;
    }

    // Phương thức kiểm tra xem tam giác có là tam giác cân hay không
    public static boolean isIsoscelesTriangle(double a, double b, double c) {
        return a == b || b == c || a == c;
    }

    // Phương thức kiểm tra xem tam giác có là tam giác vuông hay không
    public static boolean isRightTriangle(double a, double b, double c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }

    // Phương thức kiểm tra xem tam giác có là tam giác vuông cân hay không
    public static boolean isRightIsoscelesTriangle(double a, double b, double c) {
        return (isRightTriangle(a, b, c) && isIsoscelesTriangle(a, b, c));


        
    }
}


       

