
def no_duplicate_list(list1):
    set1 = set(list1)
    return list(set1)

list1 = [1,2,3,4,5,61,2,3]
ans = no_duplicate_list(list1)
print(ans)