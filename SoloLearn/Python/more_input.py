'''
So we know that the input() function returns a string. But what if we need it to be something else, like a number? No problem, we can totally do that!

Let's assume we’ve taken the age of the user as an input. 

To convert it to a number, we can use the int() function
'''

age = int(input())
print(age)  


x = "2"

y = "4"

z = int(x) + int(y)

print(z)

# Similar to the int() function, the float() function converts a string to a float:

height = float(input())
print(height) 

x = 9.34

y = int(x)

print(y)

'''
Sometimes there is a need to use a number in a string concatenation.

This can be done using the str() function, which converts a number to a string.
'''

age = 42
print("His age is " + str(age))  

# The last thing to mention is that you can use input() multiple times to take multiple user inputs.

name = input()
age = input()

print(name + " is " + age)  