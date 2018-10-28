# программа, в которой пользователь угадывает число. генкрируемое функцией random, в ограниченное кол-во попыток
#
import random
chance = random.randint(3,8)

print("u have ", chance, " chance to guess the number")
number = random.randint(1, 100)
print("number 1 - 100")
while True:
    choice = int(input("enter u're number\n"))
    if choice == number:
        print("great, u guess the number")
        break
    else:
        print("u not gueseed number")
        chance -= 1
        if choice < number:
            print("it's too small")
        if choice > number:
            print("it's too big")
        if chance == 0:
            print("u can't guess the fucking number, what a retard")
            print("computer guess - ", number)
            break
