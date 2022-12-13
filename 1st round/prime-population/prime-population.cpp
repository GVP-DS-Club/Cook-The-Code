#include <bits/stdc++.h>

using namespace std;
int m=1000001;
int main()
{
    int t,i,j,k,x,y,z,a[m];
    for(i=0;i<m;i++)
    a[i]=1;
    a[0]=0;
    a[1]=0;
    j=m/2;
    for(i=2;i<=j;i++)
    {
        if(a[i]==1)
        {
            k=2;
            while(i*k<m)
            {
                a[i*k]=0;
                k++;
            }
        }
    }
    for(i=1;i<m;i++)
    a[i]+=a[i-1];
    cin>>t;
    while(t--)
    {
        cin>>x>>y;
        z=a[y]-a[x-1];
        cout<<z<<"\n";
    }
}
