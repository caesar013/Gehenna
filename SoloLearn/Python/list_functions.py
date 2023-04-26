'''
Python has a bunch of useful built-in functions for lists.

len() lets you get the number of items in a list.
'''

nums = [1, 2, 3, 4, 5, 6]
print(len(nums))

# You can also use len on strings to return their length (character count)

'''
The append() function is used to add an item to the end of the list
'''

nums = [1, 2, 3]
nums.append(4)
print(nums)

'''
insert() inserts a new item at the given position in the list
'''

words = ['Python', 'fun']
words.insert(1, 'is')
print(words)


'''
index() finds the first occurrence of a list item and returns its index
'''

letters = ['p', 'q', 'r', 's', 'p', 'u']
print(letters.index('r'))
print(letters.index('p'))
print(letters.index('q'))

'''
max(list): Returns the maximum value.

min(list): Returns the minimum value.
'''

'''
list.count(item): Returns a count of how many times an item occurs in a list.

list.remove(item): Removes an item from a list.

list.reverse(): Reverses items in a list.
'''

x = [2, 4, 6, 2, 7, 2, 9]
print(x.count(2))

x.remove(4)
print(x)

x.reverse()
print(x)


