marks = float(input("Enter Marks: "))

grade = None

if marks in range(90,101):
    grade = 'A'
elif marks in range(70,90):
    grade = 'B'
elif marks in range(50,70):
    grade = 'C'
elif marks in range(40,50):
    grade = 'D'
elif marks in range(0,40):
    grade = 'F'
else:
    grade = 'INVALID'

print('Grade:',grade)