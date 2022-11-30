import java.util.ArrayList;
import java.util.Scanner;

public class ManagerDept {
    MyMap<Integer, Department> departments = new MyHashMap<Integer, Department>();

    public void deptAdd(int id, Department department) {
        departments.put(id, department);
    }

    public void deptShow() {
        System.out.println(departments);
    }
    public void deptAddGroup(Group group) {
        for (int i =0; i < departments.size(); i++) {
            departments.get(i).addGroupDept(group);
        }
    }

    public void deptSearchId(int id) {
        System.out.println(departments.get(id));
    }
}
