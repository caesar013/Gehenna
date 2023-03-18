'''
Lists are used to store items. 

We can create a list by using square brackets with commas separating items.
'''

words = ["Hello", "world", "!"]

# In this example the words list contains three string items: Hello, world and !.

'''

If you want to access a certain item in the list, you can do this by using its index in square brackets.

'''

print(words[0])
print(words[1])
print(words[2])


# Lists can hold different data types, such as strings and numbers.

x = ["a", "b", "c"]
y = [1, 2, 3, 4, 5]

print(x[1])
print(y[3])

'''
But lists aren’t just for shopping!

We can do some pretty cool stuff with them in Python. For example, we can use nested lists to represent 2D grids, such as matrices.
'''

m = [
    [1, 2, 3],
    [4, 5, 6]
    ]

'''
This is useful because a matrix-like structure can allow you to store data in row-column format, like in ticketing programs, 
that need to store the seat numbers in a matrix, with their corresponding rows and numbers.
'''

'''
To access the elements of a matrix, we specify the row and the column of the item using square brackets:
'''

m = [
[1, 2, 3],
[4, 5, 6]
]

print(m[1][2])


'''
The code above outputs the 3rd item of the 2nd row.
'''

'''
Strings can be indexed like lists too!

Indexing a string is like creating a list containing each character in the string.
'''

str = "Hello world!"
print(str[6])

# Note : Space (" ") is also a symbol and has an index.

'''
The string "Hello" can be thought of as a list, where each character is an item in the list. 
The first item is "H", the second item is "e", and so on.
'''

