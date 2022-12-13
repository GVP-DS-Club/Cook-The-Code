#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
    // your code goes here
    int i,j,k,n,m,x,y,z,q,u,v;
    int ans;
    cin>>n>>q;
    int a[n];
    cin>>a[0];
    // x=a[0];
    y=a[0];
    for(i=1;i<n;i++)
    {
    cin>>a[i];
    //x=min(x,a[i]);
    y=max(y,a[i]);
    }
    //u=0;
    v=y;
    sort(a,a+n);
    int b[n];
    b[n-1]=a[n-1];
    for(i=n-2;i>=0;i--)
    b[i]=a[i]+b[i+1];
    // x=1;
    // y=1000000;
    while(q--)
    {
        cin>>m;
        x=0;
        y=v;
    while(x<=y)
    {
        z=(x+y)/2;
        i=upper_bound(a,a+n,z)-a;
        if(i<n)
        {
        //j=i*z;
        j=b[i];
        j-=(n-i)*z;
        if(j>=m)
        {
            x=z+1;
            ans=z;
        }
            else
            {
            y=z-1;    
            }
        }
        else
        y=z-1;
    }
    cout<<ans<<" ";
    }
    cout<<"\n";
    return 0;
}