# 완주하지 못한 선수
# 효율성 실패함...
def solution(participant, completion):

    while True:
        if len(completion) > 0:
            completeRunner = completion.pop()
            for i,j in enumerate(participant):
                if completeRunner == j:
                    participant.remove(j)
                    break
        else:
            break
        
    return participant[0]

solution(["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"])