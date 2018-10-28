# программа, которая считает по просьбе пользователя в заданном интеравале
#

print("enter interval to count numbers")
start = int(input("enter primary value: "))
end = int(input("enter final value: "))
interval = int(input("enter interval: "))
while start < end:
    print(start)
    start += interval
