import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Department {
    private int id;
    private String name;
    private String description;
    private ArrayList<Employees> employees;
    private ArrayList<Group> groups;

    public Department(int id, String name, String description, ArrayList<Employees> employees, ArrayList<Group> groups) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.employees = employees;
        this.groups = groups;
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

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public boolean showDepartment() {
        System.out.println("\tId: " + id);
        System.out.println("\tName: " + name);
        System.out.println("\tDescription: " + description);
        System.out.println("\tGroup: " + groups);
        return true;
    }

    public boolean addGroupDept(Group group) {
        groups.add(group);
        return true;
    }

    @Override
    public String toString() {
        return "\tId: " + id + "\tName: " + name + "\tDescription: " + description + "\tGroups: " + groups;
    }
}
