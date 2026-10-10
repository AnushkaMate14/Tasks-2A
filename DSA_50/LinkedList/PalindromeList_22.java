package DSA_50.LinkedList;

import java.util.*;

public class PalindromeList_22 {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head;

        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        boolean palindrome = true;

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            if (!list.get(left).equals(list.get(right))) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(palindrome);
    }
}
