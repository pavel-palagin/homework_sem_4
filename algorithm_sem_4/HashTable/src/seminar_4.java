public class seminar_4 {

    public static void main(String[] args) {
        Node node = new Node();
        seminar_4 seminar_4 = new seminar_4();
        for (int i = 0; i < 32; i++) {
            seminar_4.put(i + 1, i);
        }
        System.out.println(seminar_4.get(30));
        seminar_4.replays(30, 2318);

        System.out.println(seminar_4.get(30));
//        seminar_4.remove(30);


//        System.out.println(seminar_4.get(30));
        System.out.println(seminar_4.containsKey(30));
        System.out.println(seminar_4.containsValue(2318));
//
        System.out.println(seminar_4.size());


    }

    static Node head;
    Node[] massiv = new Node[16];

    public Object replays(Integer key, Integer v) {
        int index = key.hashCode() % 16;
        if (massiv[index] != null) {
            Node tempNode = massiv[index];
            while (tempNode != null) {
                if (tempNode.key == key) {
                    Integer x = tempNode.value;
                    tempNode.value = v;
                    return x;
                }
                tempNode = tempNode.next;
            }
        }
        return null;
    }

    public Object get(Integer key) {
        int index = key.hashCode() % 16;
        if (massiv[index] != null) {
            Node tempNode = massiv[index];
            while (tempNode != null) {
                if (tempNode.key == key) {
                    return tempNode.value;
                }
                tempNode = tempNode.next;
            }
        }
        return null;
    }

    public Object remove(Integer key) {
        int index = key.hashCode() % 16;
        if (massiv[index] != null) {
            Node tempNode = massiv[index];
            if (tempNode.key == key && tempNode.next == null) {
                massiv[index] = null;
                return tempNode.value;
            }
            if (tempNode.key == key && tempNode.next != null) {
                massiv[index] = tempNode.next;
                return tempNode.value;
            }
            while (tempNode.next != null) {
                if (tempNode.next.key == key) {
                    Integer tmp = tempNode.next.value;
                    tempNode.next = tempNode.next.next;
                    return tmp;
                }
                tempNode = tempNode.next;
            }
        }
        return null;
    }

    public Object put(int v, int k) {
        Node temp = new Node();
        temp.value = v;
        temp.key = k;
        temp.hash = temp.key.hashCode() % 16;
        if (massiv[temp.hash] != null) {
            Node tempNode = massiv[temp.hash];
            while (tempNode != null) {
                if (tempNode.key == k) {
                    return tempNode.value;
                }
                tempNode = tempNode.next;
            }
            temp.next = massiv[temp.hash];
        }
        massiv[temp.hash] = temp;
        return null;
    }


    public int size() {
        int size = 1;
        Node temp = new Node();
        if (massiv[temp.hash] != null) {
            while (temp != null) {
                temp = temp.next;

                size++;
            }

        }
        return size;
    }


    public boolean containsKey(Integer key) {
        int index = key.hashCode() % 16;
        if (massiv[index] != null) {
            Node tempNode = massiv[index];
            while (tempNode != null) {
                if (tempNode.key == key) {
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        return false;
    }


    public boolean containsValue(Integer value) {
        Node temp = new Node();

        if (massiv[temp.hash] != null){

            Node tempNode = massiv[temp.hash];
            while (tempNode != null){
                if (tempNode.value == value){
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        return false;
    }

    static class Node {
        Integer value, key;
        int hash;
        Node next;


    }
}