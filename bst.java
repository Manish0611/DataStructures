// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }
    }
    public static void preoder(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preoder(root.left);
        preoder(root.right);
    }
    public static void roots(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }             
        roots(root.left);
        System.out.print(root.data+" ");
        roots(root.right);
        
    }
    public static void right(Node root){
        if(root==null){
            System.out.print(-1+" ");
            return;
        }
        right(root.left);
        right(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String args[]) {
       int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       BinaryTree tree = new BinaryTree();
       Node root = tree.buildtree(nodes);
       //preoder(root);
       //roots(root);
       right(root);
     
   }

}