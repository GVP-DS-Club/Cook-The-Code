import java.util.*;
public class Solution{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int i=n*n;
            i+=n;
            //n+=i;
            i/=2;
            n=(int)(Math.sqrt(i));
            if(n*n==i){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");            }
        }
    }
}