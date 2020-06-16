def solution(n, lost, extra):
	# 작성중...
    print(n)
    print(lost)
    print(extra)
    arr = []
    cnt = 0
    
    # 학생 수
    for i in range(1,n+1):
        arr.append(i)
    
    
    x = list(set(arr) - set(lost))
    
    print("x값", x)
 
    for i in range(len(extra)):
        print(extra[i])
        print(extra[i] in extra)
        print(extra[i] in x)
        print(extra[i]-1 in x)
        # 값 있을때
        if (extra[i] in x) == True:
            if (extra[i]-1 in x) == False:
                print("현재값있고 뒤로 값없음")
                cnt += 1
            elif (extra[i]+1 in x) == False:
                print("현재값있고 앞에 값없음")
                cnt += 1
        # 값 없을때
        elif (extra[i] in x) == False:
            print("현재값없음")
            x.append(extra[i])
            
    print("extra: ",extra)
    print("extra길이: ",len(extra))
    print("값: ",cnt)
    answer = len(x)+cnt
    
    if answer > len(arr):
        answer = len(arr)
        
    return answer
                    
#solution(5, [2,3], [3,4])
#solution(5, [1,2], [2,3])

solution(8, [3,7], [2,4])

#solution(5, [2, 4], [1, 3, 5])
#solution(5, [2, 4], [3])
# 1 3 5