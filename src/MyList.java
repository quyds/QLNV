public class MyList {

    public static class Node<T> {
        private  T data;
        private Node<T> next;

        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }

        public Node(){

        }
        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

    }

    public static class MyStack<T> { //LIFo
        private Node<T> top;
        private Node<T> node;
        private int size;

        public MyStack (){
            top = null;
            size = 0;
        }

        public boolean isEmpty(){
            if(getSize() == 0){
                return true;
            }else{
                return false;
            }
        }

        public int getSize(){
            return size;
        }

        public void push (T data){
            node = new Node<>(data, this.top);
            top = node;
            size++;
        }

        public T peek(){
            return this.top.getData();
        }

        public T pop(){
            T data;

            if(isEmpty() == true) {
                System.out.println("stack empty");
                return null;
            }

            if(getSize() == 1) {
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

    public static class MyQueue<T> { //LIFo
        private Node<T> top;
        private Node<T> node;
        private int size;

        public MyQueue (){
            top = null;
            size = 0;
        }

        public boolean isEmpty(){
            if(getSize() == 0){
                return true;
            }else{
                return false;
            }
        }

        public int getSize(){
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
            Node<T> data = top;
            top = top.getNext();
            return data.getData();
        }

        public T poll(){
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

    public static void main(String[] args)
    {

        MyQueue<Integer> queue = new MyQueue<>();

        queue.offer(1);
        queue.offer(3);
        queue.offer(5);

        System.out.println(queue.peek());
        System.out.println(queue.getSize());
        queue.show();

    }
}
