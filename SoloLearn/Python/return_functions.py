'''
Certain functions, such as int or str, return a value instead of outputting it. 

The returned value can be used later in the code, for example, by getting assigned to a variable. 

To do this for your defined functions, you can use the return statement. 
'''

def sum(x, y):
  return x+y

'''
Returning is useful when you don't need to print the result of the function, but need to use it in your code. 
For example, a bank account's withdraw() function could return the remaining balance of the account. 
'''

# You can use the returned value in your code, for example, an if statement

def max(x, y):
  if x >=y:
    return x
  else:
    return y

if max(6, 4) > 10:
  print("Yes")
else:
  print("Nope")

'''

Once you return a value from a function, it immediately stops being executed. 

Any code placed after the return statement won’t be executed.

'''
def add_numbers(x, y):
  total = x + y
  return total
  print("This won't be printed")

print(add_numbers(4, 5))

# A function can only return once, thus, if you need to return multiple values, you can use a list.

def double(a, b):
  return [a*2, b*2]

x = double(6, 9)
print(x)