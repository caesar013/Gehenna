# Functions can take arguments, which can be used to generate the function output.

def exclamation(word):
  print(word + "!")

exclamation("spam")

# As you can see from the example, the argument is defined inside the parentheses and is named word.

# You can call the same function with different arguments.

def exclamation(word):
  print(word + "!")

exclamation("spam")
exclamation("eggs")
exclamation("python")

# Arguments are used to pass information to the function. This allows us to reuse the function logic for different values.

'''
Even better, you can define functions with more than one argument; separate them with commas. 
'''

def print_sum_twice(x, y):
  print(x + y)
  print(x + y)

print_sum_twice(5, 8)

'''
As you can see in the previous examples, arguments can be used as variables inside the function.

You can have different statements in your functions, working with the argument variables, such as if statements and loops.
'''