//kieutanphuoc bai tap lthdt//
import java.util.Scanner;

public class phantux{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số phần tử của mảng
        System.out.print("Nhap SPT cua mang: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng arr với n phần tử
        int[] arr = new int[n];

        // Nhập giá trị cho các phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap lai SPT (>0):" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Nhập giá trị cho phần tử x
        System.out.print("Nhap gia tri PT x: ");
        int x = scanner.nextInt();
        // Tìm xem phần tử x đó có mặt trong mảng một chiều không
        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("PT " + x + " co mat trong mang!");
        } else {
            System.out.println("PT " + x + " khong co mat trong mang!");
        }

        // Tìm phần tử nhỏ nhất và lớn nhất của mảng
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Phan tu nho nhat cua mang la: " + min);
        System.out.println("Phan tu lon nhat cua mang la: " + max);

        // Kiểm tra trong mảng vừa nhập có số dương hay không
        boolean hasPositiveNumber = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                hasPositiveNumber = true;
                break;
            }
        }
        if (hasPositiveNumber) {
            System.out.println("Mang vua nhap co chua so duong.");
        } else {
            System.out.println("Mang vua nhap khong chua so duong.");
        }

        // Tính tổng các phần tử dương trong mảng
        int sumPositive = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                sumPositive += arr[i];
            }
        }
        System.out.println("Tong cac phan tu duong la: " + sumPositive);

        // Tính tổng các phần tử là số chẵn trong mảng
        int sumEven = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            }
        }
        System.out.println("Tong cac phan tu so chan trong mang la: " + sumEven);
    }

    }
    //made by kieu tan phuoc




