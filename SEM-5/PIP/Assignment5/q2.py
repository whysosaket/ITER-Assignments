globalVar = 10

def test():
    localVar = 20
    globalVar = 30 
    print('Inside function test: globalVar =', globalVar)
    print('Inside function test: localVar =', localVar)

test()

"""
Inside function test: globalVar = 30
Inside function test: localVar = 20
Outside function test: globalVar = 10
"""

print('Outside function test: globalVar =', globalVar)
