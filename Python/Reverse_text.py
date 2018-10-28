# программа, которая принимает текст от пользователя и печатает его наоборот
#

message = input("enter any text: ")
message_rev = message[:: -1]
print(message_rev)
