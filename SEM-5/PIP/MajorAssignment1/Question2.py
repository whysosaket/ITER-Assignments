# Saket Aryan
# 2141001066
# CSE Z
# Serial Number: 2

dict = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F']

def is_integer(n):
    try:
        float(n)
    except ValueError:
        return False
    else:
        return float(n).is_integer()

def hex2int(hex):
    hex = str(hex).upper()
    if hex not in dict:
        print(f"\nInvalid Input: Number is not a single digit hexadecimal number\n\n")
        return None
    return dict.index(hex)
    
def int2hex(num):
    if not is_integer(num):
        print(f"\nInvalid Input: Given number is not an Integer\n\n")
        return None
    else:
        num = int(num)
    if num>15 or num<0:
        print(f"\nInvalid Input: Number should be between 0 and 15\n\n")
        return None
    return dict[num]

def hex_to_int_driver():
    num = input("Enter number in hex: ")
    converted = hex2int(num)
    if converted != None:
        print(f"\nDecimal value of Hex number",num,"is",converted,f"\n")
    else:
        hex_to_int_driver()

def int_to_hex_driver():
    num = input("Enter number (0 to 15): ")
    converted = int2hex(num)
    if converted != None:
        print(f"\nHex value of Decimal number",num,"is",converted,f"\n")
    else:
        int_to_hex_driver()

def main():
    while True:
        print("1. Hex to Int")
        print("2. Int to Hex")
        print("3. Exit")
        menu = int(input("Choose an option: "))
        if menu == 1:
            hex_to_int_driver()
        elif menu == 2:
            int_to_hex_driver()
        elif menu == 3:
            exit()
        else:
            print("Choose Correct Option")

if __name__ == '__main__':
    main()