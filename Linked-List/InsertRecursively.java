import java.util.Scanner;

class ListNode {
    ListNode next;
    int val;

    public ListNode() {
        next = null;
    }

    public ListNode(int val) {
        this.val = val;
        next = null;
    }
}

public class InsertRecursively {
    static void insert(ListNode head, int val, int k) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode ans = temp;
        while (k > 1) {
            temp = temp.next;
            k--;
        }
        ListNode a = temp.next;
        temp.next = new ListNode(val);
        temp = temp.next;
        temp.next = a;
    }

    static ListNode insetRec(ListNode head, int val, int k) {
        if (k == 0) {
            ListNode temp = new ListNode(val);
            temp.next = head;
            return temp;
        }
        head.next = insetRec(head.next, val, k - 1);
        return head;
    }

    static ListNode input() {
        Scanner inp = new Scanner(System.in);
        ListNode head = new ListNode(-1);
        ListNode ans = head;
        int n = inp.nextInt();
        while (n != -1) {
            ListNode temp = new ListNode(n);
            head.next = temp;
            head = head.next;
            n = inp.nextInt();
        }
        return ans.next;
    }

    static void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = input();
        // insert(head, 10, 3);
        head = insetRec(head, 10, 0);
        print(head);
    }
}
