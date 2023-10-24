month = input("Enter Month: ")
month = month.lower()

day30 = ['april', 'june', 'september', 'november']
day31 = ['january', 'march', 'may', 'july', 'august', 'october', 'december']

if month == "february":
    print("28 or 29 Days")
elif month in day30:
    print("30 Days")
elif month in day31:
    print("31 Days")
else: 
    print("Invalid Month")