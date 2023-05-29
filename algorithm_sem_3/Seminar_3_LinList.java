public class Seminar_3 {

    private Node head;
    private Node tail;

    public void addFirst(String str) {
        Node node = new Node();
        node.value = str;
        if (head != null) {
            if (size() == 1) {
                tail = head;
            }
            node.next = head;
            node.previous = tail;
        }

        
        head = node;

    }

    public void remove() {
        if (head != null) {
            head = head.next;
        }
    }

    public int size() {
        int size = 1;
        if (head == null) {
            return 0;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        return size;
    }

    public String getNode(int index) {

        if (index > size() - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node temp = head;
        while (index > 0) {
            temp = temp.next;
            index--;
        }

        return temp.value;
    }


    class Node {
        public String value;
        public Node next;
        public Node previous;
    }

    public void revert(){
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null){
                tail = currentNode;
            }
            if (next == null){
                head = currentNode;
            }
            currentNode = next;
        }
    }


}
