#Taking Input in Linked List And Printing List

```
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

public class template {
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
        print(head);
    }
}
```
