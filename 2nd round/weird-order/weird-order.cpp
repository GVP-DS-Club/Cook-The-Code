#include<bits/stdc++.h>
using namespace std;
int a[26];
bool tray(char x,char b)
{
    return a[x-97]<a[b-97];
}
int main()
{
    int i,j,k,x,y,z;
    char b;
    for(i=0;i<26;i++)
{
cin>>b;
a[b-97]=i;
}
int t;
cin>>t;
while(t--)
{
    string s;
    cin>>s;
    sort(s.begin(),s.end(),tray);
    cout<<s<<"\n";
}
    return 0;

}