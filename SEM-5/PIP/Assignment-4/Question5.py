def findHCF(num1, num2):
    if num1 < num2:
        minNum = num1
    else:
        minNum = num2

    for i in range(minNum, 1, -1):
        if num1 % i == 0 and num2 % i == 0:
            HCF = i
            return HCF # New Line Added Here
        return HCF

def main():
    num1 = int(input("Enter first number: "))
    num2 = int(input("Enter second number: "))
    print(findHCF(num1, num2))

if __name__ == '__main__':
    main()
