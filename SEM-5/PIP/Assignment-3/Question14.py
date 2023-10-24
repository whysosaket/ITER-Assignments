
def is_palindrome(n):
    nc = n
    sum = 0
    
    while nc>0:
        sum*=10
        sum+=nc%10
        nc//=10
    return n==sum

n = 12221
ans = is_palindrome(n)
print(ans)