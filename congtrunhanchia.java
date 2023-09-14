import java.util.Scanner;

public class congtrunhanchiamadekieutanphuoc{

    public static void main(String[] args) {
        // Nhập vào hai số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen lon nhat:");
         int a = scanner.nextInt();
           System.out.println("Nhap vao so nguyen thu hai:");
           int b = scanner.nextInt();

        // Hiển thị ra màn hình các lựa chọn
        System.out.println("Chon phep toan ban muon tinh:");
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
                System.out.println("Tong cua hai so la: " + (a + b));
                break;
             case 2:
                 System.out.println("Tru cua hai so la: " + (a - b));
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
                System.out.println("Lua chon ko hop le!");
        }
    }
}
//kieutanphuoc//
//dont copy pls because too much lỗi bruh bruh:))//

//bí mật nằm ở dưới//










































//tui bik thế nào mấy og cũng copy của tui à thoai kéo lên lại đi xem chi cho tốn mấy giây:))))))///
//và tui đã bỏ ra từ 2h cho đến 9h để fix lại cái này ngồi muón lòi trĩ và vâng hận java thiek sự:))//
