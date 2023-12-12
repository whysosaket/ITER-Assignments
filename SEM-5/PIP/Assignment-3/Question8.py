import math

def is_perfect_natural(a):
    if a <= 0:
        return False
    sum = 0
    for i in range(1,a//2+2):
        if a%i==0:
            sum+=i
    return sum==a

n = int(input("Enter Number: "))
is_perfect = is_perfect_natural(n)
print(is_perfect)