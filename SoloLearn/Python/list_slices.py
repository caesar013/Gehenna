'''
List slices allow you to get a part of the list using two colon-separated indices. 
This returns a new list containing all the values between the indices.
'''

squares = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
print(squares[2:6])
print(squares[3:8])
print(squares[0:1])

'''
Note :
Just like the arguments to range, the first index provided in a slice is included in the result(inclusive), but the second isn't(exclusive).
'''

'''
If the first number in a slice is omitted, it’s taken to be the start of the list.

'''

squares = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
print(squares[:7])

'''
If the second number is omitted, it’s taken to be the end.
'''

squares = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
print(squares[7:])

'''
Just like with ranges, your list slices can include a third number, representing the step, to include only alternate values in the slice.
'''

squares = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
print(squares[::2])
print(squares[2:8:3])

'''
Negative values can also be used in list slicing (as well as normal list indexing). 

Which means that when negative values are used for the first and second values in a slice (or a normal index), they count from the end of the list.
'''

squares = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
print(squares[1:-1])

# Note : If a negative value is used for the step, the slice will be done backwards.

'''Using [::-1] as a slice is a common and idiomatic way to reverse a list.'''

nums = [5, 42, 7, 1, 0]
res = nums[::-1]
print(res)
