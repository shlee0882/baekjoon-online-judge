from sys import stdin
import sys

a, b = map(int, stdin.readline().split())

i = 0
c = []

while i < a:
    c.append(int(stdin.readline()))
    i += 1

c.sort(reverse=True)

tmp1,tmp2 = 0, 0

for i in c:
    if i <= b:
        tmp1 = b // i
        b = b-(tmp1 * i)
        tmp2 += tmp1
        

print(tmp2)



