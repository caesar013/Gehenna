# The for loop is used to iterate over a given sequence, such as lists or strings.

words = ["hello", "world", "spam", "eggs"]
for word in words:
  print(word + "!")

# Let's break down this code

'''
The for loop defines a variable that takes the value of the current item of the list on each iteration.

In the code above, the word variable represents the corresponding item of the list in each iteration of the loop.

During the 1st iteration, word is equal to "hello", and during the 2nd iteration it's equal to "world", and so on.
'''

nums = [4, 7, 3, 1]

for x in nums:

    print(x*2)
# 8 14 6 2


# A for loop can be used to iterate over strings.

str = "testing for loops"
count = 0

for x in str:
  if x == 't':
    count += 1

print(count)

'''
The code above defines a count variable, iterates over the string and calculates the count of 't' letters in it. 
During each iteration, the x variable represents the current letter of the string.
'''

'''
The count variable is incremented each time the letter 't' is found, so at the end of the loop, it represents the number of 't' letters in the string.
'''

'''
Similar to while loops, the break and continue statements can be used in for loops, to stop the loop or jump to the next iteration.
'''

text = "some text"
for x in text:
  if x == 'e':
    break
  print(x)

list = [2, 3, 4, 5, 6, 7]

for x in list:

   if(x%2==1 and x>4):

      print(x)

      break
   

'''
So we’ve got the for and while loops, which can be used to execute a block of code multiple times. So which do we use and when?

Usually we’d use the for loop when the number of iterations is fixed. For example, iterating over a fixed list of items in a shopping list.

The while loop is useful in cases when the number of iterations isn’t known and depends on some calculations and conditions in the code block of the loop. For example, ending the loop when the user enters a specific input in a calculator program.
'''

'''
While both for and while loops can be used to achieve the same results, the for loop has a cleaner and shorter syntax, making it a better choice in most cases.
'''

nums = [1, 2, 3, 4]

res = 0

for x in nums:

    if x%2==0:

        continue

    else:

        res += x

        

print(res)


