import random

green = ['0', '00']
red = [1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36]
black = [2,4,6,8,11,13,15,17,20,22,24,26,28,29,31,33,35]

spin = random.choices(green+red+black)[0]

if spin in green:
    print('Pay', spin)
    exit()

color = 'Black' if spin in black else ('Red' if spin in red else 'Green')
oddeven = 'Odd' if spin%2==1 else 'Even'
payrange = '1 to 18' if spin <= 18 else '19 to 36'

print('Pay', spin)
print('Pay', color)
print('Pay', oddeven)
print('Pay', payrange)