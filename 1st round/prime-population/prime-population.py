m=1000001
l=[]
for i in range(m):
    l.append(1)
l[0]=0
l[1]=0
j=m//2
for i in range(2,j+1):
    if(l[i]==1):
        k=2
        while(i*k<m):
            l[i*k]=0
            k+=1
for i in range(1,m):
    l[i]+=l[i-1]
t=int(input())
while(t):
    t-=1
    x,y=map(int,input().split())
    z=l[y]-l[x-1]
    print(z)