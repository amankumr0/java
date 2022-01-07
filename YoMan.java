import java.util.List;
import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

class Solution {
    public ListNode middlNode(ListNode head) {
        ListNode middleNode = new ListNode();
        middleNode.next = head;
        System.out.println(head.next);
        return null;
    }
}

public class YoMan {

    public static void main(String[] args) {
        ListNode Last = new ListNode(5);
        ListNode a = new ListNode(4,Last);
        ListNode head = new ListNode();
        head.next = a;
        System.out.println(head);

    }
}