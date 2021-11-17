<!-- .slide: id="libraries" -->

# 🐍 Libraries
<!-- .element: class="headline" -->

Perform you start re-inventing the wheel for various tasks, have a look at what packages are out there already.  
Here are some recommendations:

- `numpy` & `scipy`
    - high-performance numerical computations, multi-dimensional arrays
- `matplotlib` & `seaborn` & `plotly` & `bokeh`
    - graphical visualization with a focus on mathematical applications
- `pandas`
    - tabular data
- `sympy`
    - symbolic mathematics
- `networkx`
    - graphs and networks
- `requests`
    - network requests
- `tkinter` & `pyqt`
    - graphical user interfaces
- ...

---

## Demo of `numpy` and `pandas`

```py
# ./python/numpy_demo.py

import matplotlib.pyplot as plt
import numpy as np

# get 1000 numbers between -5 and 5
xs = np.linspace(-5, 5, 1000)

# apply a function on this numpy array
ys = xs ** 2 - 1

# show a figure
plt.plot(xs, ys)
plt.show()

```

```py
# ./python/pandas_demo.py

import pandas as pd

# quickly read a csv file
df = pd.read_csv("./datasets/iris.csv")
print(df)

```
