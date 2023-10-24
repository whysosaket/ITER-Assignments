
def sum_of_digits(n):
    sum=0
    while n>0:
        sum+=n%10
        n//=10
    return sum

n = 123
sum = sum_of_digits(n)
print(sum)