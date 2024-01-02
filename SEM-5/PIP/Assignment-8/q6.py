def sumOfEven(n):
    if n <= 0:
        return 0
    return n + sumOfEven(n-2)

n = int(input("Enter n: "))
print(sumOfEven(n))