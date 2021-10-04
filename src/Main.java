import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee("1","Trung son",22, "012345", "abc", 1000, 1000, 500);
        Employee employee2 = new FullTimeEmployee("2","Trung ",22, "012345", "abcd", 100, 100, 5000);
        Employee employee3 = new PartTimeEmployee("3", "Truong", 20, "01235","abg", 8);
        Employee employee4 = new PartTimeEmployee("4", "Tuong", 20, "01235","abg", 8);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.setEmployeeList(employeeList);
        //Hiển thị danh sách nhân viên
        employeeManager.displayEmployee();
        //Thêm 1 nhân viên
        employeeManager.addEmployee(employee3);
        //làm thêm các phương thức tính trung bình lương nhân viên.

    }
}
