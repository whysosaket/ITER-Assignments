def func1():
    l1 = list()
    l2 = list()
    for i in range(0,5):
        l1.append(i)
        l2.append(i+3)
    print(l1)
    print(l2)
func1()

"""
[0, 1, 2, 3, 4]
[3, 4, 5, 6, 7]
"""

def func2():
    l1 = list()
    l2 = list()
    for i in range(0,5):
        l1.append(i)
        l2.append(i+3)
        l1, l2 = l2, l1
    print(l1)
    print(l2)
func2()

"""
[3, 1, 5, 3, 7]
[0, 4, 2, 6, 4]
"""