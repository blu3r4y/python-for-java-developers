def replace(numbers):
    numbers = [42, 43, 44]


def append(numbers):
    numbers.append(42)


one_two_three = [1, 2, 3]

replace(one_two_three)
print(one_two_three)    # > [1, 2, 3]

append(one_two_three)
print(one_two_three)    # > [1, 2, 3, 42]
