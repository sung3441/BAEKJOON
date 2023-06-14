def solution(board, moves):
    basket = list()
    result = 0
    for move in moves:
        for i in range(0, len(board)):
            doll = board[i][move - 1]
            if doll != 0:
                board[i][move - 1] = 0
                basket.append(doll)
                if len(basket) > 1:
                    if basket[-1] == basket[-2]:
                        basket.pop()
                        basket.pop()
                        result += 2
                break
    return result