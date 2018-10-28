# тестовая программа, которая выводит количество выпавших, рандомно, орлов и решек.
#
import random
counter = int(0)
kolvo_eagle = int(0)
kolvo_tails = int(0)
while counter < 100:
    res = random.randint(1,2)
    if res == 1:
        kolvo_eagle += 1
    elif res == 2:
        kolvo_tails += 1
    counter += 1
print("tails - ", kolvo_tails)
print("eagles - ", kolvo_eagle)
