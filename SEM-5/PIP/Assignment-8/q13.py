def insertAtKthPos(lst, x, k, i=0):
    if i == len(lst):
        return lst
    if i%k == 0 and i != 0:
        lst.insert(i, x)
    return insertAtKthPos(lst, x, k, i+1)

lst = [1, 2, 3, 4, 5, 6, 7]
x = 50
k = 3
print(insertAtKthPos(lst, x, k))