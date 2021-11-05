n = int(input('Enter a number: '))

digit_sum = 0

while n > 0:
    digit_sum += n % 10
    n = n // 10

print("The digit sum is ", digit_sum)
