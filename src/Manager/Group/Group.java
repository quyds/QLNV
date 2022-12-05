import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    private int id;
    private String name;
    private String description;
    private ArrayList<Employees> employees;

    public Group(int id, String name, String description, ArrayList<Employees> employees) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employees> employees) {
        this.employees = employees;
    }

    public boolean addUserGroup(Employees employee) {
        for (int i =0; i < employees.size(); i++) {
            employees.add(employee);
        }
        return true;
    }

    @Override
    public String toString() {
        return "\tId: " + id + "\tName: " + name + "\tDescription: " + description + "\tEmployees: " + employees;
    }
}
