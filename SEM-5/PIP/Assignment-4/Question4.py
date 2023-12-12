def isLeapYear(year):
    # return year%400 == 0 or year%100 == 0 and year%4 == 0
    return year%400 == 0 or (year%100 != 0 and year%4 == 0)

isLeap = isLeapYear(2100)
print(isLeap)