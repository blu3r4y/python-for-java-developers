def rectangle_area(a, b):
    return a * b


def is_square(a, b):
    return a == b


print("rectangleArea(1, 5) =", rectangle_area(1, 5))
print("rectangleArea(1.5, 2.3) =", rectangle_area(1.5, 2.3))

print("isSquare(1, 5) =", is_square(1, 5))
print("isSquare(5, 5) =", is_square(5, 5))


# you can specify argument names explicitly (and even change their order)
rectangle_area(a=2, b=5)
rectangle_area(b=5, a=2)
