package DSA_50.LinkedList;

public class DetectRemoveLoop_25 {

    static void removeLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                break;
        }

        if (slow != fast)
            return;

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        Node last = slow;

        while (last.next != slow) {
            last = last.next;
        }

        last.next = null;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head.next.next.next.next = head.next;

        removeLoop(head);

        System.out.println("Loop removed");
    }
}
