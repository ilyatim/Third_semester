# игра виселица
# правила стандартной игры
import random
MAX_WRONG = 6 #number of attempts
WORDS = ("rules", "human", "always", "duck", "honor", "training") #words
word = random.choice(WORDS)
so_far = "-" * len(word) #u're answers
wrong = 0
used = [] #used symbol
print("welcome to gallows")
while wrong < MAX_WRONG and so_far != word:
    print("u offer:", used)
    print("word - ", so_far)
    guess = input("enter the character - ")
    guess = guess.upper()
    while guess in used:
        print("u're already entered this symbol")
        guess = input("enter new symbol - ")
        guess = guess.upper()
    used.append(guess)
    guess = guess.lower()
    if guess in word:
        print("congration, u're guessed the symbol")
        new = ""
        for i in range(len(word)):
            if guess == word[i]:
                new += guess
            else:
                new += so_far[i]
        so_far = new
    else:
        print("u not guessed the symbol")
        wrong += 1
if wrong == MAX_WRONG:
    print("GAME OVER")
else:
    print("U WIN")