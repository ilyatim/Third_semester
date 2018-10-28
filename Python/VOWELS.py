# удаление из строк гласных букв
#

message = input("Enter text:\n")
new_message = ""
VOWELS = "qeyuioa"
for letter in message:
    if letter.lower() not in VOWELS:
        new_message += letter
print("new string without vowels character: ", new_message)