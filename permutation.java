import java.util.*;
class main{
    public static void per(char[] ar,int f){
        if(f==ar.length-1){
            System.out.println(ar);
            return;
        }
        for(int i=f;i<ar.length;i++){
            swap(ar,i,f);
            per(ar,f+1);
            swap(ar,i,f);
        }
        
    }
    public static void swap(char[] ar,int i,int f){
        char temp=ar[i];
        ar[i]=ar[f];
        ar[f]=temp;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] ar=s.toCharArray();
        per(ar,0);
    }
}