# Let’s start with the and operator. It is True, if both conditions evaluate to True 

print(1 == 1 and 2 == 2)
True
print(1 == 1 and 2 == 3)
False
print(1 != 1 and 2 == 2)
False
print(2 < 1 and 3 > 6)
False

if (1 == 1) and (2 + 2 > 3):

  print("true")

else:

  print("false")

# The or operator is True if either (or both) of its conditions are True, and False if both conditions are False.

print( 1 == 1 or 2 == 2 )
True
print( 1 == 1 or 2 == 3 )
True
print( 1 != 1 or 2 == 2 )
True
print( 2 < 1 or 3 > 6 )
False

# As you can see, besides values, you can also compare variables to form conditions

age = 24
limit = 18
height = 191

if age > limit and height > 180:
  print("Yes")

'''
Finally, the not operator works a little differently. not takes just one argument, and inverts it.

The result of not True is False, and not False goes to True.
'''

print(not 1 == 1)
False
print(not 1 > 7)
True


if not True:

   print("1")

elif not (1 + 1 == 3):

   print("2")

else:

   print("3")


# You can chain multiple conditional statements in an if statement using the Boolean operators.

country = "US"
age = 42

if(country == "US" or country == "GB") and (age > 0 and age < 100): 
  print("Cool")

hour = 9
day = 23
print(hour > 12 and day <= 15 or hour < 10)


'''
Python's order of operations is the same as that of normal mathematics: 
parentheses first, then exponentiation, then multiplication/division, and then addition/subtraction.
'''