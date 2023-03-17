# To end a while loop prematurely, we can use a break statement.

i = 0
while True:
  print(i)
  i = i + 1
  if i >= 5:
    print("Breaking")
    break

print("Finished")

'''
Here is one example use case of break:

An infinite while loop can be used to continuously take user input. For example, you are making a calculator and need to take numbers from the user to add together and stop when the user enters "stop".

In this case, the break statement can be used to end the infinite loop when the user input equals "stop".
'''

# Using the break statement outside of a loop causes an error.

'''
Another statement that can be used within loops is continue. 

Unlike break, continue jumps back to the top of the loop, rather than stopping it. Basically, the continue statement stops the current iteration and continues with the next one.
'''

i = 0
while i<5:
  i += 1
  if i==3:
    print("Skipping 3")
    continue
  print(i)

