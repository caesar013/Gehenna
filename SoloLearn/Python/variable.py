'''
You can think of a variable as a box that contains something. A variable has a label or name and contains a value. It lets you store a value by assigning it to a name. The name can be used to refer to the value later in the program.
'''
'''
We create a variable by connecting the name and the value using one equals sign =.

The example below stores the number 15 in a variable named points.
'''

point = 15
print(point)

# You can assign any type of value to your variable
x = 42      # Integer
y = "Hello" # String
z = 3.14    # Float

# The equal sign is also called the assignment operator.

# Note : A variable stores the value throughout the program.

# You can create as many variables as you need to solve your problem.

x = 9
y = 5
print(x*y)
print(x-y)

'''
You can name variables in different ways. You can use letters and underscores. You can use numbers as long as you don’t start the name of a variable with a number.  You can’t use special characters like %
'''

stock_price = 12000
# Stock-Price -> error

# Note : Remember, Python is a case-sensitive language. Which means Lastname and lastname are two different variable names.

'''
As you’ve seen, you can use variables in the print statement to output their values.

If you need to output multiple variables in the same line, you can separate them with commas in the print statement
'''

result = 798
currency = "$"
print("Total:",currency,result)

'''
Summary :
1. You can store important information using variables.
2. You can do different operations with variables
3. You can output the value of a variable.
'''