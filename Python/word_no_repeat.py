# программа, которая выводит слова, введенные пользователем
#
import random
words = []
words_no_repeat = []
word = None
while True:
    word = input("enter word, 0 to exit - ")
    if word == "0":
        break
    words.append(word)
while len(words) != len(words_no_repeat):
    num = random.choice(words)
    if num not in words_no_repeat:
        print(num)
        words_no_repeat.append(num)
