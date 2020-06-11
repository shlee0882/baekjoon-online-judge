# 완주하지 못한 선수
# 효율성 실패함...
def solution(p, c):
    p.sort()
    c.sort()
    for i,j in zip(p,c):
        if i != j:
            return i
    
    return p[-1]

solution(["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"])
