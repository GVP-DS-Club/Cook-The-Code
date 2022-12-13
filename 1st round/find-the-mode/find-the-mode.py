t=int(input())
while(t):
    t-=1
    s=input()
    l=[0,0,0,0,0,0,0,0,0,0]
    for c in s:
        x=int(c)
        #print(x)
        l[x]+=1
    x=max(l)
    y=0
    for i in range(10):
        if(l[i]==x):
            y=i
    print(y)