x = True
y = False

print("x | y =", x | y)  # bitwise or
print("x & y =", x & y)  # bitwise and
print("x ^ y =", x ^ y)  # exclusive or

# this is especially useful for some binary computations

port    = 0b1011_1011
bitmask = 0b0010_0000

result = port & (bitmask >> 1)

print(result)
print(f"{result:08b}")  # we learn more about formatting in the next section ...

# > 16
# > 00010000
