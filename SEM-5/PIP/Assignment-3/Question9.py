
def find_max(a,b):
    max = a if a>b else b
    return max

a,b,c = 1,3,2

max = find_max(a,find_max(b,c))
print(max)