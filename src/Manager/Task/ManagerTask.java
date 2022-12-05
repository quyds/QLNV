import java.util.ArrayList;

public class ManagerTask {
    ArrayList<Task> tasks = new ArrayList<Task>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void showTask() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i).toString());
        }
    }

    public int searchTaskId(int key) {
        int start = 0;
        int end = tasks.size() - 1;
        System.out.println(end);
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (tasks.get(mid).getId() == key) {
                System.out.println(tasks.get(mid));
                break;
            }
            if (tasks.get(mid).getId() > key) {
                end = mid - 1;
            }
            if (tasks.get(mid).getId() < key) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
