# программа, в которой пользователь загадывает число, а компьютер его отгадывает
#
import random
number = int(input("enter u're number what u want to guess from 1 to 100\n"))
counter_1 = int('1')
counter_2 = int('100')
number_of_comp = random.randint(counter_1, counter_2)
turn = int('0')
if number == number_of_comp:
    print("great, comp guess u're number in 1 turn")
while number != number_of_comp:
    if number > counter_1:
        counter_1 *= 2
    if number < counter_2:
        counter_2 /= 2
    number_of_comp = random.randint(counter_1, counter_2)
    turn += 1
print("u're number ", number_of_comp)
print("guess in ", turn, " turns")