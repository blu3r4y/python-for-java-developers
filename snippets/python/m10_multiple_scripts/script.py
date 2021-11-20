# let's show the user a message first
print("Hello Python")

# let's copy the number-of-digits example to here
n = int(input("Number: "))
n_digits = 1
while n >= 10:
    n //= 10
    n_digits += 1

# the following will do nothing inside a Python script or module
n_digits

# you always need print statements
print("Number of digits:", n_digits)
