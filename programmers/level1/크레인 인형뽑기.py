def solution(board, moves):
    answer = 0
    box = []
    for move in moves:
        for doll in board :
            if(doll[move-1] != 0):
                box.append(doll[move-1])
                doll[move-1] = 0
                break

        if(len(box) >= 2):
            if(box[len(box) -1] == box[len(box) -2]):
                box.pop()
                box.pop()
                answer +=2
    return answer