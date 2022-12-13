#include <bits/stdc++.h>

using namespace std;
//long int m=100000000;
int main()
{
    int t,i,j,k;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int a[n],b[n],c[n];
        for(i=0;i<n;i++)
        cin>>a[i];
        i=1;
        c[0]=0;
        for(j=1;j<n;j++)
        {
             while(a[j]<a[c[i-1]]&&i>0)
             {
                 b[c[i-1]]=j;
                 i--;
             }
              c[i]=j;
             i++;
        }
        while(i>0)
        {
            b[c[i-1]]=-1;
            i--;
        }
        for(i=0;i<n;i++)
        cout<<b[i]<<" ";
        cout<<"\n";
    }
    return 0;
}
