import java.util.Scanner;

public class congtrunhanchia{

    public static void main(String[] args) {
        // Nhập vào hai số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen lon nhat:");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so nguyen thu hai:");
        int b = scanner.nextInt();

        // Hiển thị ra màn hình các lựa chọn
        System.out.println("Chon mot trong phep ton sau:");
        System.out.println("1.Cong");
          System.out.println("2. Tru");
             System.out.println("3. Nhan");
                   System.out.println("4. Chia");

        // Lấy lựa chọn của người dùng
        System.out.println("Nhap vao lua chon cua ban:");
        int choice = scanner.nextInt();

        // Thực hiện phép toán
        switch (choice) {
            case 1:
                System.out.println("Ton cua hai so la: " + (a + b));
                break;
            case 2:
                System.out.println("Hieu cua hai so la: " + (a - b));
                break;
            case 3:
                System.out.println("Tich cua hai so la: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Khong the chia cho 0");
                } else {
                    System.out.println("Thuong cua 2 so la: " + (a / b));
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }
}
