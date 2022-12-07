import static java.util.Objects.requireNonNull;

public class MyMapp {

    public static class Node<K, V> {
        private K key;
        private V value;
        private Node<K, V> prev;

        public Node(K key, V value, Node<K, V> prev) {
            this.key = key;
            this.value = value;
            this.prev = prev;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node<K, V> getPrev() {
            return prev;
        }

        public void setPrev(Node<K, V> prev) {
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "node: " + key + ", " + value + " " + prev;
        }
    }

    public static class MyMap<K, V> {
        private Node<K, V> top;

        public MyMap (){
            top = null;
        }

        public boolean isEmpty(){
            if(top == null){
                return true;
            }else{
                return false;
            }
        }

        public void put(K key, V value) {
            Node<K, V> newNode = new Node<>(key, value, this.top);
            if (top == null) {
                top = newNode;
            } else {
                if (checkKeyExisted(key)) {
                    top = newNode;
                }else {
                    System.out.println("Key error");
                }
            }
        }

        public boolean checkKeyExisted(K key) {
            boolean result = true;
            for (Node<K, V> currentNode = top; currentNode != null; currentNode = currentNode.prev) {
                if (key == currentNode.getKey()) {
                    result = false;
                }
            }
            return result;
        }

        public V get(K key) {
            for (Node<K, V> currentNode = top; currentNode != null; currentNode = currentNode.prev) {
                if (currentNode.key.equals(key)) {
                    System.out.println(currentNode.value);
                    return currentNode.value;
                }
            }
            return null;
        }

        public V remove(K key) {
            requireNonNull(top);
            for (Node<K, V> currentNode = top; currentNode != null; currentNode = currentNode.prev) {
                if (currentNode.prev == null && currentNode.key == key) {
                    top = null;
                    return (V) currentNode.value;
                }
                if (currentNode.prev != null && currentNode.key == key) {
                    top = currentNode.getPrev();
                    return (V) currentNode.value;
                }
                if (currentNode.prev != null && currentNode.prev.key == key) {
                    currentNode.prev = currentNode.prev.prev;
                    return (V) currentNode.prev.value;
                }
            }
            return null;
        }

        public void show (){
            Node<K, V> data = top;
            if(isEmpty()){
                System.out.println("stack empty");
            }else{
                System.out.printf(data.getKey() + ", " + data.getValue() + "\n");
                while (data.getPrev() != null){
                    data = data.getPrev();
                    System.out.println(data.getKey() + ", " + data.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        MyMap<Integer, String> mapp = new MyMap<>();

        mapp.put(1, "a");
        mapp.put(2, "b");
        mapp.put(3, "c");
        mapp.put(4, "d");

        mapp.remove(3);

        mapp.show();
    }
}
