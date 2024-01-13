import math

def LCM(a,b):
    max_num = max(a,b)
    min_num = min(a,b)
    for i in range(max_num, max_num*min_num+1, max_num):
        if i % min_num == 0:
            return i

a, b = 10, 5
lcm = LCM(a,b)

print(lcm)