
class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class linkedlist {

    Node head;
    Node tail;
    int size;

    int search(int val) {
        if (head == null) {
            return -1;
        }
        Node temp = head;
        int indx = 0;

        while (temp != null) {
            if (temp.val == val) {
                return indx;
            }
            temp = temp.next;
            indx++;
        }
        return -1;

    }

    void addatTail(int val) {

        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;

    }

    void addatHead(int val) {

        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;

    }

    void Display() {
        if (head == null) {
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    void insert(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("invalid index.");
        } else if (idx == 0) {
            addatHead(val);
        } else if (idx == size) {
            addatTail(val);
        } else {
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;

        }
    }

    void DeleteAthead() {
        if (head == null) {
            System.out.println("this is an empty linkedlist:-");
            return;
        }
        head = head.next;
        size--;
    }

}

public class AddAttail {

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addatTail(303);
        ll.addatTail(313);
        ll.addatTail(353);
        ll.addatTail(363);
        ll.addatTail(323);
        ll.addatHead(98);
        ll.Display();
        ll.DeleteAthead();
        ll.Display();
        System.out.println(ll.search(363));
        System.out.print(ll.size);
        ll.insert(200, 2);
        ll.Display();

        // Node a = new Node(10);
        // Node b = new Node(20);
        // Node c = new Node(30);
        // Node d = new Node(40);
        // a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = null;
    }
}
