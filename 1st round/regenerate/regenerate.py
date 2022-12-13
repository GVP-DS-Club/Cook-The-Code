import math
t=int(input())
while(t):
    t-=1
    c=int(input())
    n=int(math.log(c)/math.log(2))
    n+=1
    j=1
    k=-1
    a=0
    b=0
    for i in range(n):
        if(c%2):
            b+=j
            k=j
        else:
            a+=j
            b+=j
        j*=2
        c//=2
    if(k!=-1):
        b-=k
        a+=k
    print(a*b)
