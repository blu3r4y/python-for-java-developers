def function_with_default_args(x, y, name="Unknown User", factor=1.2):
    result = x * y * factor
    print(f"Hello {name}, your result is {result}")


function_with_default_args(1, 2)
function_with_default_args(1, 2, name="Mario")
function_with_default_args(1, 2, factor=10)

# > Hello Unknown User, your result is 2.4
# > Hello Mario, your result is 2.4
# > Hello Unknown User, your result is 20


def function_with_two_return_values(radius):
    pi = 3.14159

    circumference = 2 * pi * radius
    area = pi * radius ** 2

    return circumference, area


c, a = function_with_two_return_values(5)

print("circumference", c)
print("area", a)

# > circumference 31.4159
# > area 78.53975
