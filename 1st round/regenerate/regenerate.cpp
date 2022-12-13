#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
long int t,n,a,b,c,i,j,k;
cin>>t;
while(t--)
{
    cin>>c;
    n=log2(c);
    n++;
    j=1;
    k=-1;
    a=0;
    b=0;
    for(i=0;i<n;i++)
    {
     if(c%2)   
     {
         b+=j;
         k=j;
     }
     else
     {
         a+=j;
         b+=j;
     }
     j*=2;
     c/=2;
    }
    if(k!=-1)
    {
    
        b-=k;
        a+=k;
    }
    long int g=a*b;
    cout<<g<<"\n";
}
	return 0;
}
