
def is_armstrong(n):
    nc = n
    sum=0
    while n>0:
        sum+=(n%10)**3
        n//=10
    return sum == nc


def print_armstrongs():
    for i in range(1,1001):
        if is_armstrong(i):
            print(i)

print_armstrongs()