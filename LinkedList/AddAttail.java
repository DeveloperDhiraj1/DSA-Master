
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

    Node intersection(Node head1, Node head2) {
        int len1 = 0;
        Node temp1 = head1;
        while (temp1 != null) {
            temp1 = temp1.next;
            len1++;
        }
        int len2 = 0;
        Node temp2 = head2;
        while (temp2 != null) {
            temp2 = temp2.next;
            len2++;
        }
        temp1 = head1;
        temp2 = head2;
        if (len1 > len2) {
            for (int i = 1; i <= len1 - len2; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 1; i <= len2 - len1; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }

    boolean detect_loop() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;

    }

    // Method 1
    int getMiddle(int val) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;

        // Method 2
        // int length = 0;
        // Node temp = head;
        // while (temp != null) {
        //     temp = temp.next;
        //     length++;
        // }
        // temp = head;
        // for (int i = 1; i <= length / 2; i++) {
        //     temp = temp.next;
        // }
        // return temp.val;
    }

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

    int get(int idx) {
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;

    }

    void delete(int idx) {
        if (idx < 0 || idx == size) {
            return;
        }
        if (idx == 0) {
            DeleteAthead();
            return;
        }
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (idx == size - 1) {
            tail = temp;
            size--;
        }
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
        ll.delete(2);
        ll.Display();
        ll.get(3);
        ll.Display();
        System.out.println(ll.getMiddle(2));
        System.out.println(ll.detect_loop());

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
