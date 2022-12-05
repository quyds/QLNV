import java.util.Scanner;

public class Employees {
    EmployeeParam employeeParam;

    public Employees(EmployeeParam employeeParam) {
        this.employeeParam = employeeParam;
    }

    public EmployeeParam getEmployeeParam() {
        return employeeParam;
    }

    public void setEmployeeParam(EmployeeParam employeeParam) {
        this.employeeParam = employeeParam;
    }

    public boolean editEmployees(Scanner sc) {
    	int phone;
    	
        System.out.print("\tEnter name: ");
        String name = sc.nextLine();
        employeeParam.setName(name);
        System.out.print("\tEnter gender: ");
        String gender = sc.nextLine();
        employeeParam.setGender(gender);
        System.out.print("\tEnter address: ");
        String address = sc.nextLine();
        employeeParam.setAddress(address);
        do {
            System.out.print("\tEnter phone number: ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
            }
            phone = sc.nextInt();
            employeeParam.setPhone(phone);
        } while (phone <= 0);
        System.out.print("\tEnter email: ");
        sc.nextLine();
        String emailE = sc.nextLine();
        employeeParam.setEmail(emailE);
        return true;
    }

    @Override
    public String toString() {
        return "\tId: " + employeeParam.getId() + "\tName: " + employeeParam.getName() + "\tGender: " + employeeParam.getGender() + "\tAddress: " + employeeParam.getAddress() +
                "\tPhone number: " + employeeParam.getPhone() + "\tEmail: " + employeeParam.getEmail() + "\tCreateAt: " + employeeParam.getCreateAt() ;
    }
}
