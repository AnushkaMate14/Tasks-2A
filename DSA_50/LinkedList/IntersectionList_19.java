package DSA_50.LinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IntersectionList_19 {

    static Node getIntersection(Node head1, Node head2) {

        Node a = head1;
        Node b = head2;

        while (a != b) {

            if (a == null)
                a = head2;
            else
                a = a.next;

            if (b == null)
                b = head1;
            else
                b = b.next;
        }

        return a;
    }

    public static void main(String[] args) {

        Node common = new Node(30);
        common.next = new Node(40);

        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = common;

        Node head2 = new Node(5);
        head2.next = common;

        Node result = getIntersection(head1, head2);

        System.out.println(result.data);
    }
}