public class MyStack<T> {
    private Node<T> top;
    private Node<T> node;
    private int size;

    public MyStack (){
        top = null;
        size = 0;
    }

    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }else{
            return false;
        }
    }

    public int size(){
        return size;
    }

    public void push (T data){
        node = new Node<>(data, this.top);
        top = node;
        size++;
    }

    public T peek(){
        if(isEmpty() == true) {
                System.out.println("stack empty");
                return null;
            }
        return this.top.getData();
    }

    public T pop(){
        T data;

        if(isEmpty() == true) {
            System.out.println("stack empty");
            return null;
        }

        if(size() == 1) {
            data = top.getData();
            top = null;
            size--;
            return data;
        }else {
            data = top.getData();
            top = top.getNext();
            size--;
            return data;
        }
    }

    public void show (){
        Node data = top;
        if(isEmpty()){
            System.out.println("stack empty");
        }else{
            System.out.printf(data.getData() + "" + ",");
            for(int i=0;i<size-1;i++){
                data = data.getNext();
                System.out.printf(data.getData() + ",");
            }
        }
    }
}