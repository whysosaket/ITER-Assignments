# Saket Aryan
# 2141001066
# CSE Z
# Serial Number: 2

def convert_to_decimal(num):
    converted = 0
    i = 0
    while num>0:
        digit = (num%10)
        if digit >=2 or digit < 0:
            print("Invalid Input")
            return None
        converted += digit*pow(2,i)
        i += 1
        num //= 10
    return converted

def main():
    num = int(input("Enter number in base 2: "))
    converted = convert_to_decimal(num)
    if converted != None:
        print("Decimal value of binary number",num,"is",converted)
    else:
        main()

if __name__ == '__main__':
    main()