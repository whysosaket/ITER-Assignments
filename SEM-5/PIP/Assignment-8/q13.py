def insertAtKthPos(lst, x, k, i=0):
    if i+k > len(lst):
        return lst
    elif i+k == len(lst):
        lst.append(x)
        return lst
    lst.insert(i+k, x)
    return insertAtKthPos(lst, x, k, i+k+1)

lst = [1, 2, 3, 4, 5, 6, 7]
x = 50
k = 3
print(insertAtKthPos(lst, x, k))