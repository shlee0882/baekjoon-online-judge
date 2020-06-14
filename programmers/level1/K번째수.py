def solution(array, commands):
    answer, list1  = [], []
    tmp, st, end, move = 0, 0 ,0, 0
    
    for i,v in enumerate(commands):
        #print(v)
        while True:
            if tmp <= len(v)-1:
                if tmp == 0:
                    st = v[tmp]
                elif tmp == 1:
                    end = v[tmp]
                elif tmp == 2:
                    move = v[tmp]
                tmp += 1
            else:
                #print(array[st-1])
                #print(array[end-1])
                
                for j in array[st-1:end]:
                    list1.append(j)
                
                list1.sort()
                answer.append(list1[move-1])
                tmp = 0
                list1 = []
                break

    return answer


solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]])