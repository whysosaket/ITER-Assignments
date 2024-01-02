
def printIncreasing(n):
    if n == 0:
        return
    printIncreasing(n-1)
    print(n, end=" ")

n = int(input("Enter n: "))
printIncreasing(n)
print()