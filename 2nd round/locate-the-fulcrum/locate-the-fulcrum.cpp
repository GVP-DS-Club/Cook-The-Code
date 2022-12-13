#include <bits/stdc++.h>

using namespace std;
//long int m=100000000;
int main()
{
    long int t,n,i,j,k;
    cin>>t;
    while(t--)
    {
        cin>>n;
        i=n*n;
        i+=n;
        i/=2;
        n=sqrt(i);
        if(n*n==i)
        cout<<"Yes\n";
        else
        cout<<"No\n";
    }
    return 0;
}
