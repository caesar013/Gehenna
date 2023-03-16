'''
One thing you can do with Booleans is use if statements to run code based on a certain condition, say, if the Boolean evaluates to True.

An if statement looks like this:

if condition:
    statements

'''

'''
Note :
Python uses indentation (that empty space at the beginning of a line) to delimit blocks of code.

Depending on the program's logic, indentation can be mandatory.

The statements in the if should be indented.
'''

x = 42
if x > 5:
   print("x is greater than 5")

# Since the condition of the if statement is True, the program outputs "x is greater than 5".

# The colon at the end of the expression in the if statement is important, don’t leave it out.
age = 24

if age > 18:
   print("Cool")

"""
Sometimes we'll have to perform more complex checks. But that's no problem, 
because if statements can be nested, one inside the other.
"""

num = 12
if num > 5:
   print("Bigger than 5")
   if num <= 47:
      print("Between 5 and 47")

# Note : Indentation is used to define the level of nesting.

x = 'a'
if x < 'c':
    x += 'b'
if x > 'z':
    x += 'c'
    
print(x)

"""
The else statement can be used to run some statements when the condition of the if statement is False.
"""
x = 4
if x == 5:
   print("Yes")
else:
   print("No")

# As with if statements, the code inside the block needs to be indented.
# The colon after the else keyword is important, don’t leave it out.

'''
Every if condition block can have only one else statement.

So for us to make multiple checks, we need to chain if and else statements.
'''

num = 3
if num == 1:
  print("One")
else: 
  if num == 2:
    print("Two")
  else: 
    if num == 3: 
      print("Three")
    else: 
      print("Something else")

# Note : Indentation determines which if/else statements the code blocks belong to.

"""

Too many if/else statements make your code long and hard to read.

The best way to solve this is the elif (short for else if) statement. 
It’s a shortcut to use when chaining together if and else statements, making the code shorter and easier to read.
"""

num = 3
if num == 1:
  print("One")
elif num == 2:
  print("Two")
elif num == 3: 
  print("Three")
else: 
  print("Something else")

"""
And as you can see in the previous example, a series of if elif statements can have a final else block, 
which is called if none of the if or elif expressions is True .
"""
