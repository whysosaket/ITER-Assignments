import math

def area_triangle(side1, side2, side3):
    if side1+side2<=side3 or side2+side1<=side3 or side3+side2<=side1:
        return "Not a valid triangle"
    s = (side1+side2+side3)/2
    area = math.sqrt(s*(s-side1)*(s-side2)*(s-side3))
    return area

def main():
    a = int(input("Enter side1: "))
    b = int(input("Enter side1: "))
    c = int(input("Enter side1: "))
    area = area_triangle(a,b,c)
    print(area)

if __name__ == '__main__':
    main()