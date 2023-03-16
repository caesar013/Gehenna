# In-place operators let you write code like 'x = x + 3' more concisely, as 'x += 3'.

x = 2
print(x)

x += 3
print(x)

# In-place operators can be used for any numerical operation (+, -, *, /, %, **, //).

x = 8

x -= 2
print(x)

x /= 3
print(x)

x **= 5
print(x)

x = 9

x %= 2

x += 3

print(x)

# You can also use in-place operators for string concatenation:

x = "spam"
print(x)

x += "eggs"
print(x)

x = "a"

x *= 3

print(x)

