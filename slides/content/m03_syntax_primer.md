<!-- .slide: id="-syntax-primer" -->

# 🐍 Syntax Primer

<!-- .element: class="headline" -->

<div class="sidebyside">

```java
// ./java/M03_MaximumValue.java#L5-L15

List<Integer> numbers = Arrays.asList(1, -10, 0, -5, -1000, 100, 7);

int maximum = numbers.get(0);

for (int number : numbers) {
    if (number > maximum) {
        maximum = number;
    }
}

System.out.println("The maximum value is " + maximum);
```

```py
# ./python/m03_maximum_value.py

numbers = [1, -10, 0, -5, -1000, 100, 7]

maximum = numbers[0]

for number in numbers:
    if number > maximum:
        maximum = number

print("The maximum value is", maximum)

```

</div>

<div class="fragment">

### What do we notice here?

- There are no semicolons `;`
- There are no types
- There are no braces `{ }` but blocks that are started by a colon `:`
- There are no parentheses `( )` around the expressions
- A list - one of many [**built-in types**](https://docs.python.org/3/library/stdtypes.html) in Python - is initialized with square brackets `[ ]`  
  ... actually, there are no arrays in Python
- The `for` and `if` syntax is slightly different
- Comments are written with the hashtag symbol `#`

</div>
