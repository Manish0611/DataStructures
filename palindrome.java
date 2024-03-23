import java.util.*;
class Node{
    int val;
    Node next;
    Node(int x){
        val=x;
    }
}
class plaindrome{
    public static boolean palin(Node head){
        if(head==null||head.next==null){
            return false;
        }
        Node slow=head;
        Node fast=head;
        while(slow.next!=null&& fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node second=reverse(slow.next);
        Node first=head;
        while(second!=null){
            if(second.val!=first.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
    private static Node reverse(Node head){
        Node prev=null;
        Node c=head;
        while(c!=null){
            Node next=c.next;
            c.next=prev;
            prev=c;
            c=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        plaindrome pal=new plaindrome();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the list: ");
        int n = sc.nextInt();
        Node l1=new Node(sc.nextInt());
        Node c=l1;
        for(int i=1;i<n;i++){
            c.next=new Node(sc.nextInt());
            c=c.next;
        }
        boolean p=pal.palin(l1);


    }
}