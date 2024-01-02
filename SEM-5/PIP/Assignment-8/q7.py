def sumOfSubsets(lst, i, sum):
    if i == len(lst):
        print(sum, end=", ")
        return
    sumOfSubsets(lst, i+1, sum)
    sumOfSubsets(lst, i+1, sum+lst[i])

lst = [2, 4, 5]
sumOfSubsets(lst, 0, 0)
print()