import math

def are_coprime(a, b):
    gcd = math.gcd(a, b)
    return gcd == 1

a, b = 15,16
ans = are_coprime(a,b)

print(ans)