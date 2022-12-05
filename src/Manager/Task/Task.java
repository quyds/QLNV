import java.util.ArrayList;
import java.util.Date;

public class Task {
    private int id;
    private String name;
    private String description;
    private ArrayList<Employees> employees;
    private ArrayList<Project> Projects;
    private Date createAt;
    private Date updateAt;

    public Task(int id, String name, String description, ArrayList<Employees> employees, ArrayList<Project> projects, Date createAt, Date updateAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.employees = employees;
        Projects = projects;
        this.createAt = createAt;
        this.updateAt = updateAt;
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

    public ArrayList<Project> getProjects() {
        return Projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        Projects = projects;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "\tId: " + id + "\tName: " + name + "\tDescription: " + description + "\tCreateAt: " + createAt;
    }
}
