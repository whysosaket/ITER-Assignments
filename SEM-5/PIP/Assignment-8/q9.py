def multiply(a, b):
    if b == 0:
        return 0
    else:
        return a + multiply(a, b-1)
    
a = int(input("Enter a: "))
b = int(input("Enter b: "))
print(multiply(a, b))