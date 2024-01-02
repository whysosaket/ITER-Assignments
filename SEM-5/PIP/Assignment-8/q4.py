def harmonicSum(n):
    if n == 1:
        return 1
    return 1/n + harmonicSum(n-1)

n = int(input("Enter n: "))
print(harmonicSum(n))