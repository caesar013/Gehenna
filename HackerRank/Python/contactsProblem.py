contacts = [
    ('James', 42),
    ('Amy', 24),
    ('John', 31),
    ('Amanda', 63),
    ('Bob', 18)
]
inp = input()
# first way
print('Not Found') if len([x[1] for x in contacts if x[0] == inp]) == 0 else print(inp + ' is ' +str([x[1] for x in contacts if x[0] == inp][0])) 
# second way
# contact = dict(contacts)
# print('Not Found') if contact.get(inp,"") == "" else print(inp + " is " + str(contact.get(inp))) 