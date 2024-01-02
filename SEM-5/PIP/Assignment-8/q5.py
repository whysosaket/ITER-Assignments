def geometricSum(n, r):
    if n == 0:
        return 0
    return r**(n-1) + geometricSum(n-1, r)

n = int(input("Enter n: "))
r = float(input("Enter r: "))
print(geometricSum(n, r))