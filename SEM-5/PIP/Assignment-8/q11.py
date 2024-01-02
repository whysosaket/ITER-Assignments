def generateBinaryStrings(n, s=""):
    if n == 0:
        print(s)
        return
    generateBinaryStrings(n-1, s+"0")
    generateBinaryStrings(n-1, s+"1")

n = int(input("Enter n: "))
generateBinaryStrings(n)
