import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyStack<S>{
    private LinkedList<S> stacks;
    private int size;

    public MyStack() {
        stacks = new LinkedList<S>();
        size = 0;
    }

    public boolean empty() {
        return size == 0;
    }

    public void push(S item) {
        size++;
        stacks.add(item);
    }
    public int size() {
        return stacks.size();
    }
    
    public S remove() {
    	return stacks.remove();
    }

    public S get(int index) {
        return stacks.get(index);
    }

    public S pop() throws NoSuchElementException {
        if(empty())
            throw new NoSuchElementException("Cannot pop from empty stack");
        else
            size--;
        return stacks.removeLast();
    }

    public S peek() throws NoSuchElementException {
        if(empty())
            throw new NoSuchElementException("Cannot pop from empty stack");
        return stacks.getLast();
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
