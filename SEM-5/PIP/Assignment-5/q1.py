globalVar = 10

def test():
    localVar = 20
    print('Inside function test: globalVar =', globalVar)
    print('Inside function test: localVar =', localVar)

test()

print('Outside function test: globalVar =', globalVar)

"""
Inside function test: globalVar = 10
Inside function test: localVar = 20
Outside function test: globalVar = 10
"""

# Note: localVar is a local variable and cannot be accessed outside the function
# print('Outside function test: localVar =', localVar)
