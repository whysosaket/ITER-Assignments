import math

def series_a(x,n):
    sum = 1
    for i in range(2,n+1,2):
        sum += (x**i)/math.factorial(i)
    return sum

def series_b(n):
    sum = 1
    for i in range(1,n+1):
        sum += (n**i)/math.factorial(i)
    return sum

ans = series_a(5,1)
print(ans)