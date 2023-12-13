
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String userName = System.getProperty("user.name");

 
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

        System.out.println("Thông tin hệ thống:");
        System.out.println("Hệ điều hành: " + osName);
        System.out.println("Phiên bản hệ điều hành: " + osVersion);
        System.out.println("Người dùng hiện tại: " + userName);
        System.out.println("Ngày giờ hiện tại: " + formattedDateTime);
    }
}
//kieutanphuoc