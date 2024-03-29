
def prime_factors(n):
    factors = []
    divisor = 2
    while n > 1:
        while n % divisor == 0:
            factors.append(divisor)
            n //= divisor
        divisor += 1
    return factors

n = int(input("Enter Number: "))

if n < 2:
    print("error: The number must be 2 or greater.")
else:
    factors = prime_factors(n)
    print(f"The prime factors of {n} are:")
    for factor in factors:
        print(factor, end="  ")
