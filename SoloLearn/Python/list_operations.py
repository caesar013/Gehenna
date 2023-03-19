# The item at a certain index in a list can be reassigned.

nums = [5, 8, 2]
nums[1] = 42

print(nums)

'''

The list of cool things we can do with lists just keeps growing!

Lists can also be added the same way strings can be.
'''

nums = [1, 2, 3]
print(nums + [4, 5, 6])

'''
Lists and strings share a lot of similarities - you can basically think of strings as lists of characters that can't be changed.

Similar to strings, a list can be multiplied by an integer
'''

nums = [1, 2, 3]
print(nums * 3)

# This repeats the list the specified number of times.

'''
To check if an item is in a particular list, we can use the in operator.

It returns True if the item occurs one or more times in the list, and False if it doesn't
'''

words = ["spam", "egg", "spam", "sausage"]
print("spam" in words)
print("egg" in words)
print("tomato" in words)

'''
The in operator is also used to determine whether or not a string is a substring of another string.
'''

x = "hello world"

if "world" in x:
  print("Yes")

# Similarly, to check if an item is not in a list, you can use the not operator in one of the following ways

nums = [1, 2, 3]
print(not 4 in nums)
print(4 not in nums)
print(not 3 in nums)
print(3 not in nums)

