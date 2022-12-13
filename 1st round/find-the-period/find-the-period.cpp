#include<bits/stdc++.h>
using namespace std;
int main()
{
    int x=520,t,q;
    cin>>t;
    while(t--)
    {
cin>>q;
while(q--)
{
    string s;
    cin>>s;
    int y=stoi(s.substr(0,2));
    int z=stoi(s.substr(3,2));
    s=s.substr(5,2);
    if(s=="PM" && y!=12)
    y+=12;
    y*=60;
    y+=z;
    y-=x;
    z=y/50;
    if(y%50)
    z++;
    cout<<z<<" ";
}
cout<<"\n";
    }

}