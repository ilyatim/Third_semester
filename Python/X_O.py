# игра в крестики-нолики по стандартный правилам
#
X = "X"
O = "O"
EMPTY = " "
TIE = "draw"
NUM_SQUARES = 9
def display_instruct():
    """выводит на экран инструкцию для игрока"""
    print("WELCOME, THIS IS THE GAME CROSS-ZERO")
    print("to make a move you need to enter a number from 0 to 8. The numbers correspond to the picture")
    print(" 0 | 1 | 2\n"
          " ---------\n"
          " 3 | 4 | 5\n"
          " ---------\n"
          " 6 | 7 | 8\n")
def ask_yes_no(question):
    """задает вопрос, ответ на который может быть "да" или "нет" """
    responce = None
    while responce not in ("y", "n"):
        responce = input(question).lower()
    return responce
def ask_number(question, low, high):
    """просит ввести число из указанного диапозона"""
    responce = None
    while responce not in range(low, high):
        responce = int(input(question))
    return responce
def pieces():
    """Определяет принадлежность первого хода человеку или компьютеру"""
    go_first = ask_yes_no("would u like to go first? (y:n) - ")
    if go_first == "y":
        print("u want to go first, ok")
        human = X
        computer = O
    else:
        print("u dont want go first, ok. Computer go first")
        human = O
        computer = X
    return computer, human
def new_board():
    """создает пустую игровую доску"""
    board = []
    for square in range(NUM_SQUARES):
        board.append(EMPTY)
    return board
def display_board(board):
    """отображает игровую доску на экран"""
    print("", board[0], "|", board[1], "|",board[2], "\n"
          " ---------\n"
          "", board[3], "|", board[4], "|",board[5], "\n"
          " ---------\n"
          "", board[6], "|", board[7], "|",board[8], "\n")
def legal_moves(board):
    """создает список доступных ходов"""
    moves = []
    for square in range(NUM_SQUARES):
        if board[square] == EMPTY:
            moves.append(square)
    return moves
def winner(board):
    """определяет победителя"""
    WAYS_TO_WIN = ((0, 1, 2),
                   (3, 4, 5),
                   (6, 7, 8),
                   (0, 3, 6),
                   (1, 4, 7),
                   (2, 5, 8),
                   (0, 4, 8),
                   (2, 4, 6))
    for row in WAYS_TO_WIN:
        if board[row[0]] == board[row[1]] == board[row[2]] != EMPTY:
            winner = board[row[0]]
            return winner
        if EMPTY not in board:
            return TIE
    return None

def human_move(board, human):
    """узнает, какой ход желает совершить игрок"""
    legal = legal_moves(board)
    move = None
    while move not in legal_moves(board):
        move = ask_number("U're turn, enter number 0-8: ", 0, NUM_SQUARES)
        if move not in legal_moves(board):
            print("already exist")
    print("ok, the move is made")
    return move
def computer_move(board, computer, human):
    """расчитывает ход компьютера"""
    board = board[:]
    BEST_MOVES = (4, 0, 2, 6, 8, 1, 3, 5, 7)
    for move in legal_moves(board):
        board[move] = computer
        if winner(board) == computer:
            print("computer move - ", end= "")
            print(move)
            return move
        board[move] = EMPTY
    for move in legal_moves(board):
        board[move] = human
        if winner(board) == human:
            print("computer move - ", end= "")
            print(move)
            return move
        board[move] = EMPTY
    for move in BEST_MOVES:
        if move in legal_moves(board):
            print("computer move - ", end= "")
            print(move)
            return move
def next_turn(turn):
    """осуществляет переход к следующему ходу"""
    if turn == X:
        return O
    else:
        return X
def congrat_winner(the_winner, computer, human):
    """поздравляет победителя"""
    if the_winner != TIE:
        print("the winner!! 3 in ryad - ", the_winner)
    else:
        print("draw")
    if the_winner == computer:
        print("computer win")
    elif the_winner == human:
        print("human win")
def main():
    display_instruct()
    computer, human = pieces()
    turn = X
    board = new_board()
    display_board(board)
    while not winner(board):
        if turn == human:
            move = human_move(board, human)
            board[move] = human
            display_board(board)
        else:
            move = computer_move(board, computer, human)
            board[move] = computer
            display_board(board)
        turn = next_turn(turn)
    the_winner = winner(board)
    congrat_winner(the_winner, computer, human)

main()