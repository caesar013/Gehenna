def fibonaci(f):
    if f == 1:
        return 1
    else:
        return (f-1)+fibonaci(f-1)
    
arr = [[1,2,3],
       [4,5,6],
       [7,8,9]]

# print(fibonaci(5))

for x in range(len(arr)):
    for y in range(len(arr[0])):
        print(arr[x][y])