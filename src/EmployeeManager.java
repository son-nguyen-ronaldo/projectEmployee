import java.util.List;

public class EmployeeManager {
    private List<Employee> employeeList;

    public EmployeeManager() {
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public void displayEmployee(){
        System.out.println("danh sách tất cả nhân viên là");
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }


}
