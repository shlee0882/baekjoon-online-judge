from sys import stdin
import sys

a = int(stdin.readline())

i = 0
b = []

tmp1 = []

ori = []
cmp = []

r1 = 0

while i < a:
    b.append(list(map(int,stdin.readline().split())))
    i += 1

# b.sort()

for i in range(len(b)):
    ori = b[i] # [1,2]
    for j in range(1, len(b)):
        if j==1: # ori = 6,10
            tmp1.append(ori)
        
        cmp = b[j] # [2,6]

        if ori[1] <= cmp[0]:
            tmp1.append(cmp)
            ori = cmp
        
    if r1 < len(tmp1):
        r1 = len(tmp1)
    tmp1 = []

print(r1)
