def deleteAtKthPos(lst, k, i=0):
    if i+k-1 >= len(lst):
        return lst
    lst.pop(i+k-1)
    return deleteAtKthPos(lst, k, i+k-1)

lst = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
k = 3
print(deleteAtKthPos(lst, k))