import java.util.*;
import java.util.*;
public class Solution {
    static int upper_bound(int array[], int key)
    {
        int index = Arrays.binarySearch(array, key);
        if (index < 0) {
            return Math.abs(index) - 1;
        }
        else {
            while (index > 0) {
                if (array[index - 1] == key)
                    index--;
                else
                    return index;
            }
 
            return index;
        }
    }  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int a[] = new int[n];
        int x=Integer.MAX_VALUE;
        int y=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            x=Math.min(x,a[i]);
            y=Math.max(y,a[i]);
        }
        int u=x;
        int v=y;
        Arrays.sort(a);
        int b[]=new int[n];
        b[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            b[i]=a[i]+b[i+1];
        }
        int ans=1,m,j;
        for(int nh=0;nh<q;nh++){
            m=sc.nextInt();
            x=0;
            y=v;
            while(x<=y){
                int z=(x+y)/2;
                int i=upper_bound(a, z);
                if(i<n){
                    j=b[i];
                    j-=(n-i)*z;
                    if(j>=m){
                        x=z+1;
                        ans = z;
                    }
                    else{
                        y=z-1;
                    }
                }
                else{
                    y=z-1;
                }
            }
            System.out.print(ans+" ");
        }
        System.out.println();
        
    



    
    }
}
