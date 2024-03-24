import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SegregateEvenOddLinkedList {

    public static ListNode segregateEvenOdd(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode evenHead = new ListNode(0);
        ListNode evenTail = evenHead;
        ListNode oddHead = new ListNode(0);
        ListNode oddTail = oddHead;

        ListNode current = head;

        while (current != null) {
            if (current.val % 2 == 0) {
                evenTail.next = current;
                evenTail = evenTail.next;
            } else {
                oddTail.next = current;
                oddTail = oddTail.next;
            }
            current = current.next;
        }

        evenTail.next = oddHead.next;
        oddTail.next = null;

        return evenHead.next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements separated by space: ");
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }

        ListNode originalList = createLinkedList(elements);

        System.out.println("Original list:");
        printLinkedList(originalList);

        ListNode result = segregateEvenOdd(originalList);
        System.out.println("Segregated list (even before odd):");
        printLinkedList(result);

        scanner.close();
    }
}
