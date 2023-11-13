# Saket Aryan
# 2141001066
# CSE Z
# Serial Number: 2

dict = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F']

def base_check(digit, base):
    if base <= 16 and base >= 2:
        dict2 = dict[:-(16-base)]
        if base == 16:
            dict2 = dict
        if digit in dict2:
            return True
        else:
            return False
    return False

def basex_to_decimal(num, base):
    converted = 0
    i = 0
    num = str(num)
    while len(num)>0:
        digit = num[-1].upper()
        if not base_check(digit, base):
            return None
        digit = dict.index(digit)
        if digit >= base and digit < 0:
            print("Invalid Input")
            return None
        converted += digit*pow(base,i)
        i += 1
        num = num[:-1]
    return converted

def decimal_to_basex(num, base):
    if num == 0:
        return dict[0]

    result = ""
    negative = False

    if num < 0:
        negative = True
        num = abs(num)

    while num > 0:
        remainder = num % base
        result = dict[remainder] + result
        num //= base

    if negative:
        result = "-" + result

    return result


def base_converter(num, base_a, base_b):
    if base_a > 16 or base_a < 2 or base_b < 2 or base_b > 16:
        print("Base should be more than equal to 2 and less than equal to 16.")
        return None
    decimal = basex_to_decimal(num, base_a)
    if decimal == None:
        print("Invalid Input")
        return
    basex = decimal_to_basex(decimal, base_b)
    return basex

def main():
    num = str(input("Enter The Number: "))
    base_a = int(input("Enter current base of input number: "))
    base_b = int(input("Enter required base of input number: "))
    converted = base_converter(num, base_a, base_b)
    print(converted)


if __name__ == '__main__':
    main()