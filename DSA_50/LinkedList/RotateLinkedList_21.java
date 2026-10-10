package DSA_50.LinkedList;

public class RotateLinkedList_21 {

    static Node rotate(Node head, int k) {

        if (head == null || head.next == null)
            return head;

        Node tail = head;
        int length = 1;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;

        if (k == 0)
            return head;

        tail.next = head;

        int steps = length - k;

        Node newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = rotate(head, 2);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}