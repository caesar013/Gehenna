'''
Comments are annotations to code used to make it easier to understand. They don't affect how code is run. 

In Python, a comment is created by inserting an octothorpe (otherwise known as a number sign or hash symbol: #). 
All text after it on that line is ignored.
'''

x = 365
y = 7

print(x % y) # find the remainder

# You can have multiple comments in your code.

x = 365
y = 7
# this is a comment

print(x % y) # find the remainder
# print (x // y)
# another comment

'''
Docstrings (documentation strings) are similar to comments, in that they’re designed to explain code. But, they’re more specific and have a different syntax.

They’re created by putting a multiline string containing an explanation of the function below the function's first line.
'''

def shout(word):
    '''
    Print a word with an
    exclamation mark following it.
    '''
    print(word + "!")
shout("spam")

'''
Unlike conventional comments, docstrings are retained throughout the runtime of the program. 
This allows the programmer to inspect these comments at run time.
'''