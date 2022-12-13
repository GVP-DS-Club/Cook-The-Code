l=[]
mod=1000000007
l.append([1 for i in range(1000)])
for i in range(999):
    l.append([1])
for i in range(1,1000):
    for j in range(1,1000):
        y=(l[i-1][j]+l[i][j-1])%mod
        l[i].append(y)
t=int(input())
while(t):
    t-=1
    m,n=map(int,input().split())
    print(l[m-1][n-1])