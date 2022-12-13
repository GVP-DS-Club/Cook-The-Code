import random
test_case=random.randint(1,500)
print(test_case)
for i in range(test_case):
    n=random.randint(1,70)
    print(n)
    for j in range(n):
        x=random.randint(1,100)
        y=x//60
        z=x%60
        y+=8
        z+=40
        if(z>=60):
            z-=60
            y+=1
        if(y>12):
            y-=12
            s='PM'
        elif(y==12):
            s='PM'
        else:
            s='AM'
        ans=''
        if(y<10):
            ans+='0'
        ans+=str(y)+':'
        if(z<10):
            ans+='0'
        ans+=str(z)+s
        if(j<n-1):
            print(ans,end=' ')
        else:
            print(ans,end='')
    print()