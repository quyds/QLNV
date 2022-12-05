public class MyQueue<T>{
    private Node<T> top;
    private Node<T> node;
    private int size;

    public MyQueue (){
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

    public void offer (T data){
        node = new Node<T>();
        if (top == null) {
            top = node;
        } else {
            Node<T> currentNode = top;
            while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(node);
        }
        node.setData(data);
        size++;
    }

    public T peek(){
        if(isEmpty() == true) {
                System.out.println("stack empty");
                return null;
            }
        return this.top.getData();
    }

    public T poll(){
        if(isEmpty() == true) {
                System.out.println("stack empty");
                return null;
            }
        Node<T> data = top;
        top = top.getNext();

        size--;
        return data.getData();
    }

    public void show (){
        Node<T> data = top;
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
