# игра, в которой можно распределять характеристики у персонажа
#

st = 10
ag = 10
wi = 10
he = 10
number_of_points = 30

def _print():
    print("YOU'RE:\nHEALTH = ", he, "\nWISDOM = ", wi, "\nAGILITY = ", ag, "\nSTRANGE = ", st)
def redistribution():
    _print()
    print("what u wand to do?")
    print("1 - to up points")
    print("2 - to take away points?")
    print("3 - to exit from the game")
    choice = int(input("enter u're choice - "))
    if choice == 3:
        return False
    change(choice)
    return True
def change(choice):
    if choice == 1:
        up_points()
    elif choice == 2:
        down_points()
def up_points():
    if check_points():
        characteristic = input("what characteristic u want to up? - ").lower()
        global he, number_of_points, st, wi, ag
        if characteristic == "health":
            he += 1
            number_of_points -= 1
        elif characteristic == "strange":
            st += 1
            number_of_points -= 1
        elif characteristic == "wisdom":
            wi += 1
            number_of_points -= 1
        elif characteristic == "agility":
            ag += 1
            number_of_points -= 1
        else:
            print("i dont know that characteristic")
    else:
        print("out of points")
def down_points():
    characteristic = input("what characteristic u want to down? - ").lower()
    global he, number_of_points, st, wi, ag
    if characteristic == "health":
        if check_charactr(he):
            he -= 1
            number_of_points += 1
        else:
            print("characteristic must be greater that zero")
    elif characteristic == "strange":
        if check_charactr(st):
            st -= 1
            number_of_points += 1
        else:
            print("characteristic must be greater that zero")
    elif characteristic == "wisdom":
        if check_charactr(wi):
            wi -= 1
            number_of_points += 1
        else:
            print("characteristic must be greater that zero")
    elif characteristic == "agility":
        if check_charactr(ag):
            ag -= 1
            number_of_points += 1
        else:
            print("characteristic must be greater that zero")
    else:
        print("i don't know that characteristic")
def check_points():
    global number_of_points
    if number_of_points > 0:
        return True
    else:
        return False
def check_charactr(characteristic):
    if characteristic > 0:
        return True
    else:
        return False
def main():
    result = True
    while True:
        result = redistribution()
        if not result:
            break

main()