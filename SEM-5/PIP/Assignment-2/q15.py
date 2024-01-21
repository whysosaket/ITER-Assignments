def fun(a=0, b=1):
    return (a**2 + b**2)

# a = fun(2,a=3)  # Type Error
# b = fun(b=3,2)   # Syntax Error
c = fun(3,b=2)      # 13
# d = fun(a=4,5)    Syntax Error

print("c = ",c)