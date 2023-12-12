
def n_lists(n):
    a_list = []
    for i in range(1,n+1):
        i_list = [i * s for s in range(1,6)]
        a_list.append(i_list)
    return a_list

ans = n_lists(5)
print(ans)