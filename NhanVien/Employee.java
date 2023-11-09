//bài 4
import java.util.Date;

public class Employee {
    private String lastName;
    private Date dateOfBirth;
    private Date startDate;

    public Employee(String lastName, Date dateOfBirth, Date startDate) {
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.startDate = startDate;
    }

    public void displayInfo() {
        System.out.println("TEN: " + lastName);
        System.out.println("Ngay Sinh: " + dateOfBirth);
        System.out.println("Bat Dau Ngay Lam: " + startDate);
    }

    public static void main(String[] args) {
    
        Employee employee = new Employee("NguyenVanA", new Date(2023, 1, 1), new Date(2021, 1, 1));
        employee.displayInfo();
    }
}
