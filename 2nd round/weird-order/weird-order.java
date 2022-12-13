import java.util.*;
public class Solution{
    static void merge(int arr[],char arr1[],int l,int m,int r)
    {
        int i=l;
        int j=m+1;
        int k=m;
        int a[]=new int[r-l+1];
        char b[] = new char[r-l+1];
        int x=0;
        while(i<=m&&j<=r)
        {
            if(arr[i]<arr[j])
            {
              a[x]=arr[i];
              b[x]=arr1[i];
              x++;
              i++;
            }
            else
            {
                a[x]=arr[j];
                b[x]=arr1[j];
                x++;
                j++;
            }
        }
        if(j>r)
        {
            while(i<=m)
            {
               a[x]=arr[i];
              b[x]=arr1[i];
              x++;
              i++; 
            }
        }
        else
        {
            while(j<=r)
            {
                a[x]=arr[j];
                b[x]=arr1[j];
                x++;
                j++; 
            }
        }
        for(i=0;i<x;i++)
        {
            arr[l+i]=a[i];
            arr1[l+i]=b[i];
        }
    }
    static void mergeSort(int arr[],char arr1[], int l, int r)
    {
        if (l < r) {
            // Same as (l+r)/2, but avoids overflow for
            // large l and h
            int m = l + (r - l) / 2;
     
            // Sort first and second halves
            mergeSort(arr,arr1, l, m);
            mergeSort(arr,arr1, m + 1, r);
            merge(arr,arr1, l, m, r);
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        int l[] = new int[26];
        for(int i=0;i<26;i++){
            l[i]=0;
        }
        for(int i=0;i<26;i++){
            l[s.charAt(i)-'a']=i;
        }
        int t=sc.nextInt();
        while(t>0){
            t--;
            String s1=sc.next();
            char m[]=new char[s1.length()];
            int z[] = new int[s1.length()];
            for(int i=0;i<s1.length();i++){
                z[i]=l[s1.charAt(i)-'a'];
            }
            m=s1.toCharArray();
            mergeSort(z,m,0,s1.length()-1);
            for(int i=0;i<s1.length();i++){
                System.out.print(m[i]);
            }
            System.out.println();
        }
        sc.close();

    }
}