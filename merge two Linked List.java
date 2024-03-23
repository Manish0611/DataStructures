// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int x){
        val=x;
    }
}
public class megrednode{
public Node merged(Node l1,Node l2){
    Node d=new Node(0);
    Node c=d;
    while(l1!=null &&l2!=null){
        if(l1.val<l2.val){
            c.next=l1;
            l1=l1.next;
        }
        else{
            c.next=l2;
            l2=l2.next;
        }
        c=c.next;
    }
    if(l1!=null){
        c.next=l1;
    }
    if(l2!=null){
        c.next=l2;
    }
    return d.next;
}
public static void printh(Node head){
    Node c=head;
    while(c!=null){
        System.out.print(c.val+" ");
        c=c.next;
    }
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    megrednode m=new megrednode();
    System.out.println("enter the size of the first linked list");
    int n=sc.nextInt();
    Node l1=new Node(sc.nextInt());
    Node c=l1;
    for(int i=1;i<n;i++){
        c.next=new Node(sc.nextInt());
        c=c.next;
    }
    System.out.println("enter the size of the second linked list");
    n=sc.nextInt();
    Node l2=new Node(sc.nextInt());
    c=l2;
    for(int i=1;i<n;i++){
        c.next=new Node(sc.nextInt());
        c=c.next;
    }
   Node answer= m.merged(l1,l2);
   m.printh(answer);
}
}
