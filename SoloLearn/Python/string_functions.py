# Strings have a format() function, which enables values to be embedded in it, using placeholders.

nums = [4, 5, 6]
msg = "Numbers: {0} {1} {2}". format(nums[0], nums[1], nums[2])
print(msg)

'''
Each argument of the format function is placed in the string at the corresponding position, 
which is determined using the curly braces { }.
'''

# You can also name the placeholders, instead of the index numbers.

a = "{x}, {y}".format(x=5, y=12)
print(a)

# join() joins a list of strings with another string as a separator.

x = ", ".join(["spam", "eggs", "ham"])
print(x)
# prints 'spam, eggs, ham'

# split() is the opposite of join(). It turns a string with a certain separator into a list.

str = "some text goes here"
x = str.split(' ')
print(x)

# We used a space ' ' as the split separator to get all words of the string as a list. 

# replace() replaces one substring in a string with another.

x = "Hello ME"
print(x.replace("ME", "world"))

# lower() and upper() change the case of a string to lowercase and uppercase.

print("This is a sentence.".upper())

print("AN ALL CAPS SENTENCE".lower())