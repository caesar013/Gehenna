'''
Python makes it super easy to create number sequences using the range() function.

By default, it starts from 0, increments by 1 and stops before the specified number.
'''

numbers = range(10)

# we can print it using for loops
for number in numbers:
    print(number)

print(numbers[0] + numbers[3])
# or store it first using list before printing
numbers = list(range(10))
print(numbers)
print(numbers[0] + numbers[3])

'''
If range is called with one argument, it’ll produce an object with values from 0 to that argument. 

If it’s called with two arguments, it’ll produce values from the first to the second.
'''

numbers = list(range(3,8))
print(numbers)

'''
There’s also a third argument you can use with range(), and it’s really useful. It’s called Step and it determines the interval of the sequence produced. 
'''

numbers = list(range(5,20, 2))
print(numbers)

'''
Want to go backward? No problem! We can also create a list of decreasing numbers, using a negative number as the third argument.
'''

x = list(range(7,3, -1))
print(x)

'''

You can use ranges in for loops, without the need to convert them into lists. It’s commonly used to repeat some code a certain number of times.
'''

for i in range(5):
    print('hello!')

