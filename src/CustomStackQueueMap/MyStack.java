public class MyStack<T> { //LIFo
    private Node<T> top;

    public MyStack (){
        top = null;
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }

    public void push (T data){
        Node<T> newNode = new Node<>(data, this.top);
        top = newNode;
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
        if(top.getNext() == null) {
            data = top.getData();
            top = null;
            return data;
        }else {
            data = top.getData();
            top = top.getNext();
            return data;
        }
    }

    public void show (){
        Node<T> data = top;
        if(isEmpty()){
            System.out.println("stack empty");
        }else{
            System.out.printf(data.getData() + ",");
            while (data.getNext() != null){
                data = data.getNext();
                System.out.println(data.getData() + ",");
            }
        }
    }
}