package DSA_50.LinkedList;

public class OddEvenList_24 {

    static Node rearrange(Node head) {

        if (head == null)
            return null;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = rearrange(head);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}