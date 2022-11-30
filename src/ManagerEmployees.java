import java.util.Scanner;

public class ManagerEmployees {
    int n;
    MyStack<Employees> employees = new MyStack<Employees>();

    Scanner sc = new Scanner(System.in);

    public void employeesAdd(Employees employee) {
        employees.push(employee);
    }

    public void employeesShow() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.peek());
        }
    }

    public void employeesEdit(int id) {
        for (int i =0; i < employees.size(); i++) {
            if (employees.get(i).employeeParam.id == id) {
                System.out.println(employees.get(i).editEmployees(sc));
            }
        }
    }
}
