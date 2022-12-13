import java.util.*;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long  t = sc.nextInt();
        while(t>0){
            t--;
            long  c=sc.nextInt();
            long n = (long)(Math.log(c)/Math.log(2));
            //int n=(int)Math.floor(x);
            n++;
            long k=-1;
            long a=0;
            long b=0;
            long j=1;
            for(long i=0;i<n;i++){
                if(c%2>0){
                    b+=j;
                    k=j;
                }
                else{
                    a+=j;
                    b+=j;
                }
                j*=2;
                c/=2;

            }
            if(k!=-1){
                b-=k;
                a+=k;
            }
            System.out.println(a*b);
        }
        sc.close();


        
    }
}
