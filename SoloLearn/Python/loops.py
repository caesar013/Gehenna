# Loops allow you to repeat a block of code multiple times.

# Here’s a while loop containing a variable that counts up from 1 to 5, at which point the loop terminates.

i = 1
while i <=5:
   print(i)
   i = i + 1

print("Finished!")

'''
During each loop run, the i variable gets incremented by one, until it reaches 5.
So, the loop will execute the print statement 5 times.
'''

# The statements inside the while loop need to be indented, similar to an if statement.

x = 0
while x<10:
  print(x)
  x += 1

# The code in the body of a while loop is executed repeatedly while the condition is True.

#This is called iteration.

sum = 0
x = 10
while x > 0:
  sum += x
  x -= 1

print(sum)

i = 3

while i>=0:

   print(i)

   i = i - 1

'''
You can also use other statements, such as if statements in loops.

This is especially useful in things like games, where you might need to loop 
through a number of player actions and add or remove points to the player’s score.
'''

x = 1
while x < 10:
  if x%2 == 0:
    print(str(x) + " is even")
  else:
    print(str(x) + " is odd")

  x += 1

# Note : str(x) is used to convert the number x to a string, so that it can be used for concatenation.

# If the condition of the while loop remains True, the loop will run indefinitely, causing an infinite loop.

# A short way to create an infinite loop is by using while True.
'''
while True
    @something
'''

