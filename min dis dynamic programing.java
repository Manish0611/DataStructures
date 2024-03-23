import java.util.*;
class main{
    public static int num(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            dp[i][0]=i;
        }
        for(int j=0;j<m;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next().trim();
        String s2=sc.next().trim();
        main v=new main();
        System.out.println(v.num(s1,s2));
    }
}