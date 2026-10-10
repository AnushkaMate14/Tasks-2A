package DSA_50.LinkedList;

public class RemoveNthNode_23 {

    static Node remove(Node head, int n) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node first = dummy;
        Node second = dummy;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = remove(head, 2);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
