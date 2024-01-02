def removeAdjacentDuplicates(lst, i=0, carry=0):
    if i == len(lst):
        return lst
    if i == 0:
        carry = lst[i]
        return removeAdjacentDuplicates(lst, i+1, carry)
    if lst[i] == carry:
        lst.pop(i)
        return removeAdjacentDuplicates(lst, i, carry)
    carry = lst[i]
    return removeAdjacentDuplicates(lst, i+1, carry)

lst = [1, 2, 4, 4, 5, 7, 7, 7, 8, 8, 9, 7]
print(removeAdjacentDuplicates(lst))
