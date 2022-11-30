import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employees employee;
        Group group;
        Department department;

        ManagerEmployees managerEmployees = new ManagerEmployees();
        ManagerGroup managerGroup = new ManagerGroup();
        ManagerDept managerDept = new ManagerDept();
        Scanner sc = new Scanner(System.in);

// Employees
        int employeeId;
        int phone;
        int editId;
        do {
            System.out.print("\tEnter id: ");
            while (!sc.hasNextInt()) {
                System.out.println("\tThat's not a number!");
                sc.next(); // this is important!
            }
            employeeId = sc.nextInt();
        } while (employeeId <= 0);
        System.out.print("\tEnter name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("\tEnter gender: ");
        String gender = sc.nextLine();
        System.out.print("\tEnter address: ");
        String address = sc.nextLine();
        do {
            System.out.print("\tEnter phone number: ");
            while (!sc.hasNextInt()) {
                System.out.println("\tThat's not a number!");
                sc.next(); // this is important!
            }
            phone = sc.nextInt();
        } while (phone <= 0);
        System.out.print("\tEnter email: ");
        sc.nextLine();
        String email = sc.nextLine();
        Date createAt = new Date();

        employee = new Employees(new EmployeeParam(employeeId, name,phone, address, email, gender,null, createAt, null, null, null));
        managerEmployees.employeesAdd(employee);

        System.out.println("--------------");
        managerEmployees.employeesShow();

        do {
            System.out.print("\tEnter id edit: ");
            while (!sc.hasNextInt()) {
                System.out.println("\tThat's not a number!");
                sc.next(); // this is important!
            }
            editId = sc.nextInt();
        } while (editId <= 0);
        managerEmployees.employeesEdit(editId);

// Group
        int groupId;
        do {
            System.out.print("\tEnter id: ");
            while (!sc.hasNextInt()) {
                System.out.println("\tThat's not a number!");
                sc.next(); // this is important!
            }
            groupId = sc.nextInt();
        } while (groupId <= 0);
        System.out.print("\tEnter name: ");
        sc.nextLine();
        String groupName = sc.nextLine();
        System.out.print("\tEnter Description: ");
        String groupDes = sc.nextLine();

        group = new Group(groupId, groupName, groupDes, null);
        System.out.println("--------------");
        managerGroup.groupAdd(group);
        managerGroup.groupShow();

        System.out.println("--------------");

        managerGroup.groupAddUser(employee);
        managerGroup.groupShow();
        System.out.println("--------------");

// Department
        int keyId;
        int deptId;
        String deptName;
        String deptDes;
        do {
            System.out.print("\tEnter key id: ");
            while (!sc.hasNextInt()) {
                System.out.println("\tThat's not a number!");
                sc.next(); // this is important!
            }
            keyId = sc.nextInt();
        } while (keyId <= 0);

        do {
            System.out.print("\tEnter id: ");
            while (!sc.hasNextInt()) {
                System.out.println("\tThat's not a number!");
                sc.next(); // this is important!
            }
            deptId = sc.nextInt();
        } while (deptId <= 0);
        System.out.print("\tEnter name: ");
        sc.nextLine();
        deptName = sc.nextLine();
        System.out.print("\tEnter Description: ");
        deptDes = sc.nextLine();
        department = new Department(deptId, deptName, deptDes, null, null);
        System.out.println("--------------");
        managerDept.deptAdd(keyId, department);
        managerDept.deptShow();
        System.out.println("--------------");
        int deptSearchId;
        do {
            System.out.print("\tEnter id: ");
            while (!sc.hasNextInt()) {
                System.out.println("\tThat's not a number!");
                sc.next(); // this is important!
            }
            deptSearchId = sc.nextInt();
        } while (deptSearchId <= 0);
        managerDept.deptSearchId(deptSearchId);
        System.out.println("--------------");
        managerDept.deptAddGroup(group);
        managerDept.deptShow();
        System.out.println("--------------");
    }
}
