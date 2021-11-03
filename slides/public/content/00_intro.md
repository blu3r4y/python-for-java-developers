## Python Crash Course for Java Developers

- 🧑 Mario Kahlhofer 
- 📧 [mario.kahlhofer@dynatrace.com](mailto:mario.kahlhofer@dynatrace.com)


Find slides and code at 🌎 [github.com/blu3r4y/python-for-java-developers](https://github.com/blu3r4y/python-for-java-developers)

<img class="r-stretch" src="/images/python-xkcd.png" />

<small>(c) https://xkcd.com/353</small>

---

## Agenda

- Intro
- Installation
- Syntax
- Data Types
- Collections
- Input and Output
- Examples, Examples, Examples
- Functions
- Classes
- Code Organization
- Libraries
- Zen of Python

---

## Literature

### Books

- 📚 Sarda, Deepak. **Python for the Busy Java Developer**. Apress, 2017.  
  DOI: [10.1007/978-1-4842-3234-7](https://doi.org/10.1007/978-1-4842-3234-7)
  *(sadly, uses the deprecated Python 2 syntax)*

### Official Documentation

- "How can I achieve X?" ... [docs.python.org/3/faq/programming.html](https://docs.python.org/3/faq/programming.html)
- "Why is Y different in Python?" ... [docs.python.org/3/faq/design.html](https://docs.python.org/3/faq/design.html)
- "What does the standard library offer?" ... [docs.python.org/3/library](https://docs.python.org/3/library)

### Cheat Sheets

- [gto76.github.io/python-cheatsheet](https://gto76.github.io/python-cheatsheet)
- [pythoncheatsheet.org](https://www.pythoncheatsheet.org)
- [pythonsheets.com](https://www.pythonsheets.com/)

---

## 💎 What is Python?

- a mature, **general-purpose, object-oriented, dynamically-typed** programming language  
  _(Java is statically-typed)_
- released in 1991 _(Java was released in 1995)_
- one of the dominating languages in machine learning, statistics, and data analytics
- popular alternative to MATLAB or Octave
- gaining in popularity year after year

<img class="r-stretch" src="/images/python-popularity.png">

---

<!-- .slide: data-background-iframe="https://www.tiobe.com/tiobe-index/" data-background-interactive -->

## ... and #1 in the TIOBE Index as of October 2021
<!-- .element: class="headline" -->

---

## Comparison to Java

### Similarities

- general-purpose, object-oriented, garbage-collected, large standard library

### Differences

- **dynamically-typed**, and not strongly-typed  
  _(type checks will only happen at runtime)_
- **interpreted with [CPython](https://github.com/python/cpython)**, and not just-in-time compiled with a JVM  
  _("more flexibility, but slower execution times")_
- **interactive mode** provided out of the box  
  _("i will show you that soon")_
