import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Vector;

public class MyQueue<S>{
    private LinkedList<S> stacks;
    private int size;

    public MyQueue() {
        stacks = new LinkedList<S>();
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }

    public S get(int index) {
        return stacks.get(index);
    }
    public void offer(S item) {
        size++;
        stacks.add(item);
    }

    public S peek() throws NoSuchElementException {
        if(isEmpty()) {
            throw new NoSuchElementException("Cannot pop from empty stack");
        }
        return stacks.getFirst();
    }

    public S poll() throws NoSuchElementException {
        if(isEmpty())
            throw new NoSuchElementException("Cannot pop from empty stack");
        else
            size--;
        return stacks.removeFirst();
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < stacks.size(); i++) {
            if (stacks.get(i) == null) {
                break;
            }
            str = str + stacks.get(i) + ",";
        }
        return str;
    }
}
