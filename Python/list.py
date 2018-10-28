# тестирование списков в языке python
#

list = ["mum", "dad", "son", "daughter"] # creating
print(list)
print(list[1:3])
del list[2] # deleting
print(list)
list.append("son") # adding
list[:] = ["grandpa"] # rename
print(list)
list += ["dad", "son", "daughter"]
print(list)
del list[:]
print(list)

list = [1, (4, 5, 6), 7]
for num in list:
    print(num, end=" ")
print()
name, age, range = list[1] #slice
print(name, age, range)

############
print()
list = ["mike", "jack", "peter"]
name = list
names = name
print(list)
print(name)
names[2] = "Ann"
print(list)
print(name)

# BUT
print()
name = list[:]
names = name[:]
print(list)
print(name)
print(names)
names[2] = "Kris"
print(list)
print(name)
print(names)

# custom