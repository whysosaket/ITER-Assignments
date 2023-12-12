
a = 1234
sum = 0

d = a%10
sum += ((d+1)%2)*d
a//=10

d = a%10
sum += ((d+1)%2)*d
a//=10

d = a%10
sum += ((d+1)%2)*d
a//=10

d = a%10
sum += ((d+1)%2)*d
a//=10

print(sum)