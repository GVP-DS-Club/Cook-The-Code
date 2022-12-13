import java.util.*;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m=1000001;
        int l[]=new int[m];
        for(int i=0;i<m;i++){
            l[i]=1;
        }
        l[0]=0;
        l[1]=0;
        int j=m/2;
        for(int i=2;i<j+1;i++){
            if(l[i]==1){
                int k=2;
                while(i*k<m){
                    l[i*k]=0;
                    k++;
                }
            }
        }
        for(int i=1;i<m;i++){
            l[i]+=l[i-1];
        }
        int t=sc.nextInt();
        while(t>0){
            t--;
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=l[y]-l[x-1];
            System.out.println(z);

        }
        sc.close();

    }
}
