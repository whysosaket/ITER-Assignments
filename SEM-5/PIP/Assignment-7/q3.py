
def count_char(s):
    s = s.upper()
    my_dict = {}
    for i in s:
        if i in my_dict:
            my_dict[i] += 1
        else:
            my_dict[i] = 1
    return my_dict

a = "Saket aryan ss"
ans = count_char(a)
print(ans)
