
def fnc(list1):
    n = len(list1)
    for i in range(1,n):
        list1[i] += list1[i-1]

list1 = [1,2,3,4,5]
fnc(list1)
print(list1)