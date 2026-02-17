
class Node1 {

    int val;
    Node1 next;

    Node1(int val) {
        this.val = val;
    }
}

public class Node_2 {

    public static void main(String[] args) {
        Node1 a = new Node1(20);
        Node1 b = new Node1(290);
        Node1 c = new Node1(270);
        Node1 d = new Node1(260);
        Node1 e = new Node1(205);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        Display(a);

    }

    public static void Display(Node1 head) {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();
    }
}
