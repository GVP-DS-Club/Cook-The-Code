import random
t=random.randint(1,30)
print(t)
while(t):
    t-=1
    n=random.randint(1,50)
    while(n):
        n-=1
        print(random.randint(0,9),end='')
    print()