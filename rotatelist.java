import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        // Step 1: Calculate the length of the linked list
        int length = 1; // Start from 1 since we are counting the head node
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        // Calculate the effective rotation
        k = k % length;
        if (k == 0) {
            return head; // No rotation needed
        }

        // Step 2: Find the (K mod length)th node from the beginning of the list
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        // Step 3: Move fast to the end and adjust pointers
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 4: Rotate the list
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
        
    }

    // Helper function to create a linked list from an array of integers
    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper function to print the linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the linked list
        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        // Input the elements of the linked list
        System.out.println("Enter the elements of the linked list:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Create the linked list from the input array
        ListNode head = createLinkedList(arr);

        // Input the rotation count
        System.out.print("Enter the rotation count: ");
        int k = scanner.nextInt();

        // Rotate the linked list
        ListNode newHead = rotateRight(head, k);

        // Print the rotated linked list
        System.out.println("Rotated Linked List:");
        printLinkedList(newHead);

        scanner.close();
    }
}
