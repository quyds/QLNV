public class MyQueue<T>{
    private Node<T> top;

    public MyQueue (){
        top = null;
    }

    public boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }

    public void offer (T data){
        Node<T> newNode = new Node<T>();
        if (top == null) {
            top = newNode;
        } else {
            Node<T> currentNode = lastNode(top);
            currentNode.setNext(newNode);
        }
        newNode.setData(data);
    }

    public Node<T> lastNode(Node<T> currentNode) {
        if (currentNode.getNext() != null) {
            currentNode = lastNode(currentNode.getNext());
        }
        return currentNode;
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
        return data.getData();
    }

    public void show (){
        Node<T> data = top;
        if(isEmpty()){
            System.out.println("stack empty");
        }else{
            System.out.printf(data.getData() + "" + ",");
            while (data.getNext() != null){
                data = data.getNext();
                System.out.printf(data.getData() + ",");
            }
        }
    }
}
