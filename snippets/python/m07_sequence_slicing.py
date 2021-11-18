numbers = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]

numbers[5:8]   # give me a new COPY of the list, starting at index 5, and ending at index 7

# > [15, 16, 17]

numbers[1:]    # all except the 1st item    > [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
numbers[:3]    # the first three items      > [10, 11, 12]

numbers[:-1]   # all except the last item   > [10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
numbers[-2:]   # the last two items         > [19, 20]

numbers[::2]   # every 2nd item             > [10, 12, 14, 16, 18, 20]
numbers[1::2]  # every 2nd, but start at 2  > [11, 13, 15, 17, 19]

# this also works with strings (which are just arrays of characters)
name = "Hello World"
name[1:-1]

# > 'ello Worl'
