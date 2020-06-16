from sys import stdin
import sys
a = int(stdin.readline())

b = list(map(int, stdin.readline().split()))

if a != len(b):
    print("입력값 오류")
    sys.exit()

b.sort()

r = 0
tmp = []

for i,item in enumerate(b):
    r += item
    tmp.append(r)

r2 = 0
for i in tmp:
    r2 += i
    
print(r2)
