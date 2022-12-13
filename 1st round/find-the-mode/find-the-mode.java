import java.util.*;
public class Solution{
    // static int maxele(int a[]){
       
    // }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            String s = sc.next();
            int l[] = new int[10];
            for(int i=0;i<10;i++){
                l[i]=0;
            }
            for(int i=0;i<s.length();i++){
                int x= Character.getNumericValue(s.charAt(i));
                l[x]+=1;
            }
            int z= Integer.MIN_VALUE;
            for(int i=0;i<l.length;i++){
                if(l[i]>z){
                    z=l[i];
                }
            }
            int x=z;
            int y=0;
            for(int i=0;i<10;i++){
                if(l[i]==x){
                y=i;
                }
            }
            System.out.println(y);
        }

        
    }
}