# программа, которая на основании введенного имени, выводит имя отца
#

def check(name, list_name):
    if name in list_name:
        return True
    else:
        return False

list_name = {}
while True:
    print("enter the son and dad (enter 0 to break)")
    dad = input("DAD - ")
    if dad == "0":
        break
    son = input("SON - ")
    if dad == "0":
        break
    if check(son, list_name):
        print("Already exist")
    else:
        list_name[son] = dad

while True:
    name = input("enter name of son(0 to exit) - ")
    if name == "0":
        break
    if name in list_name:
        print(list_name[name])
