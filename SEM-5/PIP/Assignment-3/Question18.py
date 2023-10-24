
def multiply(a,b):
    if a<0 or b<0:
        return None
    
    sum = 0
    while b>0:
        sum+=a
        b-=1

    return sum

a,b = 5,7
mul = multiply(a,b)

print(mul)