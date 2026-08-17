<!-- .slide: id="-libraries" -->

# 🐍 Libraries

<!-- .element: class="headline" -->

Don't re-invent the wheel for various tasks, have a look at what packages exist already.

### Recommended Packages

- `numpy` & `scipy` - high-performance numerical computations, multi-dimensional arrays
- `matplotlib` & `seaborn` & `plotly` & `bokeh` - graphical visualization for mathematicians
- `pandas` - work with tabular data
- `sympy` - symbolic mathematics
- `networkx` - graphs and networks
- `requests` - network requests, download files
- `tkinter` & `pyqt` - graphical user interfaces

💡 **Install new packages with `pip`**

```sh
python -m pip install <package-name>
```

---

## Library Usage

<div class="fragment">

### Compute and show a parabola with `numpy` and `matplotlib`

```py
# ./python/m11_numpy_demo.py

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

</div>
<div class="fragment">

### Read a tabular dataset with `pandas`

```py
# ./python/m11_pandas_demo.py

import pandas as pd

# quickly read a csv file
df = pd.read_csv("https://archive.ics.uci.edu/ml/machine-learning-databases/iris/iris.data")
print(df)

```

</div>
