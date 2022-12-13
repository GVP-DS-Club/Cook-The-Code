#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t,i,j,k;
    cin>>t;
    while(t--)
    {
        string s;
cin>>s;
int l[10];
for(i=0;i<10;i++)
l[i]=0;
for(i=0;i<(int)s.length();i++)
{
    char c=s[i];
    j=c-'0';
    l[j]++;
}
j=*(max_element(l,l+10));
k=0;
for(i=0;i<10;i++)
{
    if(l[i]==j)
    k=i;
}
cout<<k<<"\n";
    }
}