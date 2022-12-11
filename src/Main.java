public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();

        list.addAt(10,0);

        list.addAt(20,1);

        list.addAt(30,2);

        list.addAt(40,3);

        System.out.println(list.getAt(1));
        System.out.println(list.getAt(2));
        System.out.println(list.getAt(3));
        System.out.println(list.getAt(4));

        list.removeAt(2);

    }
}

class LinkedList {

    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public int size() {
        return this.size;
    }

    public void addAt(int item, int idx) throws Exception {
        if (idx < 0 || idx > this.size) {
            throw new Exception("Invalid Index.");
        }
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        Node nm1 = getNodeAt(idx - 1);
        Node np1 = nm1.next;
        nm1.next = nn;
        nn.next = np1;

        this.size++;

    }

    public int removeAt(int idx) throws Exception {
        if (this.size == 0) {
            throw new Exception("LL is empty.");
        }
        if (idx < 0 || idx >= this.size) {
            throw new Exception("Invalid Index.");
        }
        Node nm1 = getNodeAt(idx - 1);
        Node n = nm1.next;
        Node np1 = n.next;
        nm1.next = np1;
        this.size--;
        return n.data;
    }

    public int getAt(int idx)  {
        Node temp = this.head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    private Node getNodeAt(int idx)  {

        Node temp = this.head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp;
    }
}