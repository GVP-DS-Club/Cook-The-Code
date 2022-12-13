import java.util.*;
public class Solution{
    static int lower_bound(int array[], int key)
    {
        int index = Arrays.binarySearch(array, key);
        if (index < 0) {
            return Math.abs(index) - 1;
        }
        else {
            while (index >= 0) {
                if (index>0 && array[index - 1] == key)
                    index--;
                else
                    return index;
            }
 
            return index;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int l[]=new int[100000];
        l[0]=1;
        for(int i=1;i<100000;i++){
            l[i]=l[i-1]+i+1;
        }
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int i=lower_bound(l,n);
            if(l[i]==n){
                i+=1;
            }
            if(i%2>0){
                System.out.println("Sarath");
            }
            else{
                System.out.println("Bose");
            }
        }

    }
}