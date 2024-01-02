def deleteAtKthPos(lst, k, i=0, n=1):
    if i == len(lst):
        return lst
    if n == k:
        lst.pop(i)
        n = 1
    return deleteAtKthPos(lst, k, i+1, n+1)

lst = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
k = 3
print(deleteAtKthPos(lst, k))