import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        int mod=1000000007;
        int l[][]=new int[1000][1000];
        for(int i=0;i<1000;i++){
            l[0][i]=1;
            l[i][0]=1;        }
    
    for(int i=1;i<1000;i++){
        for(int j=1;j<1000;j++){
            y=(l[i-1][j]+l[i][j-1])%mod;
            l[i][j]=y;
        }
    }
    int t =sc.nextInt();
    while(t>0){
        t--;
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(l[m-1][n-1]);
    }
    sc.close();

}
}
