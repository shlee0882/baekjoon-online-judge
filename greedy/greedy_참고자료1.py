# greedy 참고자료

def min_calc(value, coin):
    a=[]
    for i in coin:
        a.append([value-i,i])
    print(a)

    
    
    # a = [361, 1]
    res = a[0]
    
    # res = [361,1]    
    #print(res)
    #print(a)
    for i in a:
        #print(i)
        # i=[361,1]
        # res[0] = 361 >  i[0] = 361
        # print(a)
        if res[0] > i[0] and i[0] > 0:
            res = i
    return res

coin = [1,50,100]
value = [362,0]
dic = {}

for i in coin:
    dic[i] = 0

#print(dic)

value = min_calc(value[0], coin)

'''
while True:
    value = min_calc(value[0], coin)
    #print(value)
    if value[0] < 0:
        break
    else:
        dic[value[1]] += 1
'''
# print(dic)
