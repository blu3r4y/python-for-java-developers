prices = [12.3, 5.2, 8.7, 1.2, 8.0]
gross = []

for price in prices:
    if price > 8:
        gross.append(price * 1.2)

print(gross)
