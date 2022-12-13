import bisect as bs
l=[1]
for i in range(1,100000):
    l.append(l[i-1]+i+1)
t=int(input())
while(t):
    t-=1
    n=int(input())
    i=bs.bisect_left(l,n)
    if(l[i]==n):
        i+=1
    if(i%2):
        print("Sarath")
    else:
        print("Bose")