# Booleans can have two values: True and False.

# We can create Booleans by comparing values, by using the equal operator ==. Like this:

my_boolean = True
print(my_boolean)

print(2 == 3)

print("hello" == "hello")

# Note : Be careful not to confuse assignment (one equal sign) with comparison (two equal signs).

# The Boolean data type has one of only two possible values: True and False

open = True
closed = False

'''
Booleans are created when comparing values. Python has a number of comparison operators: 
equal to ==, not equal to !=, greater than >, smaller than <, greater or equal to >=, smaller or equal to <=.
'''

x = 7

print(x != 8)
print(x > 5)
print(x < 2)
print(x >= 7)
print(x <= 7)

# Comparison operators are also called Relational operators.

print(7 != 8)

'''
Greater than and smaller than operators can also be used to compare strings lexicographically 
(the alphabetical order of words is based on the alphabetical order of their component letters). 
'''

print('a' > 'b')
 
print("Bob" > "Dave")

# The True and False Boolean values can be represented as integers 1 and 0, respectively. 

x = (7 > 5)
print(int(x))

# Note, that we used the int() function to convert the Boolean to an integer.