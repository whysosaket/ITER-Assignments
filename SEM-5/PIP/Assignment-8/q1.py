def convert(s):
    if len(s) == 1:
        return int(s)
    return convert(s[:-1]) * 10 + int(s[-1])

s = input("Enter a number: ")
print(type(s))
print(type(convert(s)))
