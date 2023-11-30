prices = [12.3, 5.2, 8.7, 1.2, 8.0]
gross = []

for price in prices:
    gross.append(price * 1.2)

print(gross)

# or, with list comprehension
prices = [12.3, 5.2, 8.7, 1.2, 8.0]
gross = [price * 1.2 for price in prices]

print(gross)
