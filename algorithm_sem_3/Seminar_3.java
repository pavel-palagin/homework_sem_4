public class Seminar_3 {

    public Node head;

    public void add(String str) {
        Node node = new Node();
        node.value = str;
        if (head != null) {
            node.next = head;
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
    }



//    public void revert(Node currentNode, Node previousNode){
//        if (currentNode == null){
//            head = currentNode;
//        } else {
//            revert(currentNode.next, currentNode);
//        }
//        currentNode.next = previousNode;
//    }


    // Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
    public void revert(){
        if (head != null){
            Node current = head.next;
            head.next = null;
            while (current != null){
                Node next = current.next;
                current.next = head;
                head = current;
                current = next;
            }

        }

    }
}
