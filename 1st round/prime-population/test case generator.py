import random
t=random.randint(1,10000)
print(t)
while(t):
    t-=1
    #print(random.randint(1,100))
    a=random.randint(1,1000)
    b=random.randint(a,100000)
    print(f'{a} {b}')