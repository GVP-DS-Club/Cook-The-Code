def tray(c):
    return l[ord(c)-97]
s=input()
l=[0 for i in range(26)]
for i in range(26):
    l[ord(s[i])-97]=i
t=int(input())
while(t):
    t-=1
    s=input()
    m=list(s)
    m.sort(key=tray)
    for c in m:
        print(c,end='')
    print()