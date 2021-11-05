import matplotlib.pyplot as plt
import numpy as np

# get 1000 numbers between -5 and 5
xs = np.linspace(-5, 5, 1000)

# apply a function on this numpy array
ys = xs ** 2 - 1

# show a figure
plt.plot(xs, ys)
plt.show()
