import java.util.*;
public class Solution{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int i,j;
        while(t>0){
            t--;
            int n=sc.nextInt();
            int a[]= new int[n];
            int b[]= new int[n];
            int c[]= new int[n];

        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
         i=1;
        c[0]=0;
        for(j=1;j<n;j++){
            while(i>0 && a[j]<a[c[i-1]]){
                b[c[i-1]]=j;
                i--;
            }
            c[i]=j;
            i++;
        }
        while(i>0){
            b[c[i-1]]=-1;
            i--;
        }
        for(i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
                       }
        }
    }
