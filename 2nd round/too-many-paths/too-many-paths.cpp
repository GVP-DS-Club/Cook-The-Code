#include <bits/stdc++.h>

using namespace std;
int m=1000000007,a[1000][1000];
int main()
{
    int i,j,k;
    for(i=0;i<1000;i++)
    {
        a[i][0]=1;
        a[0][i]=1;
    }
    for(i=1;i<1000;i++)
    {
        for(j=1;j<1000;j++)
        a[i][j]=(a[i-1][j]+a[i][j-1])%m;
    }
    cin>>k;
    while(k--)
    {
        cin>>i>>j;
        cout<<a[i-1][j-1]<<"\n";
    }
    return 0;
}
