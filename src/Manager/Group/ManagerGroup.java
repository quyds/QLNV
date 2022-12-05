import java.util.*;

public class ManagerGroup {
    MyQueue<Group> groups = new MyQueue<>();

    Scanner sc = new Scanner(System.in);

    public void groupAdd(Group group) {
        groups.offer(group);
    }

    public void groupShow() {
        for (int i =0; i < groups.size(); i++) {
            System.out.println(groups.peek());
        }
    }
    public void groupAddUser(Employees employees) {
        for (int i =0; i < groups.size(); i++) {
//            groups.get(i).addUserGroup(employees);
        }
    }

    public void groupSearchId(int id) {
        for (int i =0; i < groups.size(); i++) {
//            if (groups.get(i).getId() == id) {
//                System.out.println(groups.get(i).toString());
//            }
        }
    }
}
