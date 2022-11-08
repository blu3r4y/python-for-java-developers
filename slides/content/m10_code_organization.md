<!-- .slide: id="-code-organization" -->

# 🐍 Code Organization

<!-- .element: class="headline" -->

Let's take a quick interactive look at how one would create a Python project consisting of multiple files.

### Running Python Scripts

📜 `./python/m10_multiple_scripts`

<!-- .element: class="snippet" -->

### Packages and Modules

📜 `./python/m10_demo_project`

<!-- .element: class="snippet" -->

Learn about more **best practices** at [docs.python-guide.org/writing/structure](https://docs.python-guide.org/writing/structure/)

---

## Running Python Scripts

Your code is always executed from top to bottom.

```sh
python script.py
```

<div class="fragment">

### The Main "Function"

The `__main__` condition that you write, will only evaluate to `True` when that script is executed directly.

```py
# ./python/m10_multiple_scripts/main.py#L5-L6

if __name__ == "__main__":
    print("This will only run if you specifically started the interpretor on this file.")
```

With that, you mainly differentiate if a script is run directly, or being imported.  
Upon import, the `__main__` condition of the importee will evaluate to `False`.

```py
# ./python/m10_multiple_scripts/imports.py

import main

# you might also want to try out these:
# import script
# from main import test_variable

if __name__ == "__main__":
    print("The value of the test variable is:", main.test_variable)

```

</div>

---

## Packages and Modules

You should structure your code into [**packages**](https://docs.python.org/3/glossary.html#term-package) ("directories") and [**modules**](https://docs.python.org/3/glossary.html#term-module) ("Python files").

```text
.
├── README.md          <-- brief description
├── requirements.txt   <-- list of dependencies (list package names and versions)
├── graphics
│   ├── __init__.py
│   └── parabola.py
└── user               <-- a package named 'user'
    ├── __init__.py    <-- will be executed when you 'import user'
    └── app.py         <-- a module named 'app'
```

<div class="fragment" data-fragment-index="1">

Dependencies are usually listed in a `requirements.txt` file and are installed with `pip`. \*

```sh
python -m pip install -r requirements.txt
```

</div>
<div class="fragment">

### Running Python Modules

You run modules when your code consists of multiple files.

```sh
python -m user.app
```

When you run a module, your root package is loaded into the [**import path**](https://docs.python.org/3/glossary.html#term-import-path) of the interpreter.  
Thus, on each `import` statement you write, packages and modules will be found and imported.

</div>

<div class="fragment" data-fragment-index="1">

<small>\* Note that `pip` is a package by itself and that we use the module mode to run it. Many modules are also added to your system path upon installation, which allows you to run them directly from the command line, e.g. with `pip` instead of `python -m pip`.</small>

</div>
