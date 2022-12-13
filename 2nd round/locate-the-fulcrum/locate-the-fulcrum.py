import math
t=int(input())
while(t):
    t-=1
    n=int(input())
    i=n*n
    n+=i
    n//=2
    i=int(math.sqrt(n))
    if(i*i==n):
        print("Yes")
    else:
        print("No")
