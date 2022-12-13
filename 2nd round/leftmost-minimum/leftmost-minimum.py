t=int(input())
while(t):
    t-=1
    n=int(input())
    a=[]
    b=[]
    c=[]
    a=list(map(int,input().split()))
    for i in range(0,n):
        b.append(0)
        c.append(0)
    i=1
    for j in range(1,n):
        while(a[j]<a[c[i-1]] and i>0):
            b[c[i-1]]=j
            i-=1
        c[i]=j
        i+=1
    while(i>0):
        b[c[i-1]]=-1
        i-=1
    for i in range(0,n):
        print(b[i],end=' ')
    print()