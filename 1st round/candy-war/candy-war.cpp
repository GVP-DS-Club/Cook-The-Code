#include <bits/stdc++.h>

using namespace std;

int main()
{
    long int t,i,j,k,x,y,z=100000;
    long int a[z];
    a[0]=1;
    for(i=1;i<z;i++)
    a[i]=a[i-1]+i+1;
    cin>>t;
    while(t--)
    {long int n;
        cin>>n;
        i=lower_bound(a,a+z,n)-a;
        if(a[i]==n)
        i++;
        if(i%2)
        cout<<"Sarath\n";
        else
        cout<<"Bose\n";
    }
}