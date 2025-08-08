package Linked_Lists;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                            new ListNode(2,
                                new ListNode(3,
                                    new ListNode(4,
                                        new ListNode(5)))));

        // Reverse the list
        ListNode reversed = sol.reverseList(head);

        // Print the reversed list
        printList(reversed);
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next; // temporarily store the next node
            curr.next = prev;              // reverse the current node's pointer
            prev = curr;                   // move prev to current
            curr = nextNode;               // move current to next node
        }

        return prev; // prev is the new head
    }
}

