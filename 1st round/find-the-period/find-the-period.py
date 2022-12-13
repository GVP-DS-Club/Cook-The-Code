x=8*60+40
t=int(input())
#t=0
while(t):
    t-=1
    q=int(input())
    q=1
    while(q):
        q-=1
        l=list(input().split())
        for i in l:
            #print(i)
            y=int(i[:2])
            z=i[3:5]
            #print(z)
            z=int(z)
            if(i[5:]=='PM' and y!=12):
                y+=12
            y*=60
            y+=z
            y-=x
            z=y//50
            if(y%50):
                z+=1
            print(z,end=' ')
        print()
                
                
            