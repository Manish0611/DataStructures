// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
  public static List<Integer> spiral(int[][] mat){
     ArrayList<Integer> result=new ArrayList<Integer>();
     int top=0;
     int left=0;
     int right=mat[0].length-1;
     int buttom=mat.length-1;
     while(top<=buttom&&left<=right){
         for(int i=left;i<=right;i++){
             result.add(mat[top][i]);
         }
         top++;
         for(int i=top;i<=buttom;i++){
             result.add(mat[i][right]);
         }
         right--;
         for(int i=right;i>=left;i--){
             result.add(mat[buttom][i]);
         }
         buttom--;
         for(int i=buttom;i>=top;i--){
             result.add(mat[i][left]);
         }
         left++;
     }
     return result;
  }
    public static void main(String[] args) {
        int[][] mat={{1,2,3},
{4,5,6},
{7,8,9}};
List<Integer> spi=spiral(mat);
System.out.println(spi);
    }
}