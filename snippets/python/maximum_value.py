numbers = [1, -10, 0, -5, -1000, 100, 7]

maximum = numbers[0]

# let's find the maximum
for number in numbers:
    if number > maximum:
        maximum = number

print("The maximum value is", maximum)
