def solution(answers):
    
    a = [1, 2, 3, 4, 5] * len(answers)
    b = [2, 1, 2, 3, 2, 4, 2, 5] * len(answers)
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] * len(answers)
    
    a_cnt, b_cnt, c_cnt = 0, 0, 0
    
    d = {}
    arr = []
    tmp = []
    mx = 0
    
    for i, v in enumerate(answers):
        if v == a[i]:
            a_cnt += 1
        if v == b[i]:
            b_cnt += 1
        if v == c[i]:
            c_cnt += 1
    
    if a_cnt !=0:
        d[1] = a_cnt
    if b_cnt !=0:
        d[2] = b_cnt
    if c_cnt !=0:
        d[3] = c_cnt
    
    sorted_keys = sorted(d, key=d.get, reverse=True)
    print(sorted_keys)
    
    for i in sorted_keys:
        if mx == 0:
            mx = d.get(i)
            arr.append(i)
        else:
            if mx == d.get(i):
                arr.append(i)
    
    return arr

#solution([1,3,2,4,2])
solution([2,1,3,1,2])
#solution([1,2,3,4,5])
#solution([1,3,2,4,2,3,5,1,2,5,4,3,2,3,5,6])

#solution([1, 3, 3, 4, 5])