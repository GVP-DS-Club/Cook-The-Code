import java.util.*;
public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x=8*60+40;
        int t=sc.nextInt();
        while(t>0){
            t--;
            int q=sc.nextInt();
            String l[]=new String[q];
            for(int i=0;i<q;i++){
                l[i]=sc.next();
            }
            for(String i : l){
                int y=Integer.parseInt(i.substring(0,2));
                int z=Integer.parseInt(i.substring(3, 5));
               
                if(i.substring(5,7).equals("PM") && y!= 12){
                    y+=12;
                }
                 
                y*=60;
                y+=z;
                y-=x;
                z=y/50;
                if(y%50>0){
                    z+=1;
                }
                System.out.print(z);
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
