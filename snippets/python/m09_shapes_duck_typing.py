class Circle:
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14159 * self.radius * self.radius


class Square:
    def __init__(self, length):
        self.length = length

    def area(self):
        return self.length * self.length


shapes = [Circle(5), Square(10)]
for shape in shapes:
    print(shape.area())
