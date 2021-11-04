<!-- .slide: id="installation" -->

# 🐍 Installation
<!-- .element: class="headline" -->

Go to [python.org](https://www.python.org/) and install the 64-bit version of Python 3.8 or newer.  

🚫 **Do NOT use Python 2.7 or older anymore!**

### Usage

- `python` can be used from the command line directly
- `pip` is the most popular package manager for Python, pulling packages from [pypi.org](http://pypi.org/)

The most popular IDEs are [IntelliJ PyCharm](https://www.jetbrains.com/pycharm/) or [Visual Studio Code](https://code.visualstudio.com/)

<div class="fragment" data-fragment-index="1">

### What is Anaconda?

If you intend to use lots of scientific packages, you can install [Anaconda](https://www.anaconda.com/products/individual) or [Miniconda](https://docs.conda.io/en/latest/miniconda.html) as an alternative.  
`numpy` / `scipy` /  `sympy` /  `tensorflow` / ... usually work out of the box with Anaconda, especially on Windows.

- `conda` is the package manager used by Anaconda, pulling packages from [anaconda.org](https://anaconda.org/anaconda/repo)

</div>

---

## Jupyter Notebooks

Notebooks let you mix code and documentation, usually for prototyping or documentation purposes.

### Installation

**Jupyter Notebooks** are the "classic" notebooks and **Jupyter Labs** is the new IDE-like successor of them.

```sh
pip install jupyter jupyterlab

# or, if that doesn't work
python -m pip install jupyter jupyterlab
```

### Usage

You may want to open notebook files (`.ipynb`) directly within [VS Code](https://code.visualstudio.com/docs/datascience/jupyter-notebooks) oder [IntelliJ PyCharm](https://www.jetbrains.com/help/pycharm/jupyter-notebook-support.html).  
Alternatively, you can start a stand-alone instance in the browser from the command line.

```sh
python -m juypter notebook [--notebook-dir <path>]
python -m jupyter lab [--notebook-dir <path>]
```

Try it out!

📜 `snippets/python/jupyter_introduction.ipynb`
<!-- .element: class="snippet" -->
