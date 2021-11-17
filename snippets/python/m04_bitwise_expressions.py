port    = 0b1011_1011
bitmask = 0b0010_0000

is_bit_set = port & (bitmask >> 1)

# we learn more about formatting in the next module ...
print("dec:", is_bit_set)
print(f"bin: {is_bit_set:08b}")

# > dec: 16
# > bin: 00010000
