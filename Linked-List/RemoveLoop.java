e Ends


/*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                if(slow==head){
                    while(fast.next!=slow){
                        fast=fast.next;
                    }
                    fast.next=null;
                    break;
                }
                else{
                                slow=head;
                while(slow.next!=fast.next){
                    slow=slow.next;
                    fast=fast.next;
                }
                fast.next=null;
                break;   
                }
            }
        }
    }
}
