def area(a, b):
    return a * b


def is_square(a, b):
    return a == b


print("area(1, 5) =", area(1, 5))
print("area(1.5, 2.3) =", area(1.5, 2.3))

print("is_square(1, 5) =", is_square(1, 5))
print("is_square(5, 5) =", is_square(5, 5))


# you can specify argument names explicitly (and even change their order)
area(a=2, b=5)
area(b=5, a=2)
