#1
c =  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
result = 0
for i in range(0, 10):
    if (c[i]%2 == 0):
        result += c[i]
print(result)   # 30

#2
c =  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
result = 0
for i in range(0, 10):
    if (c[i]%2 != 0):
        result += c[i]
print(result)   # 25

#3
subject = 'computer'
subject = list(subject)
ch = subject[0]
for i in range(0, len(subject)-1):
    subject[i] = subject[i+1]
subject[len(subject)-1]=ch
print(''.join(subject)) # omputerc

#4
quantity = [15, 30, 12, 34, 56, 99]
total = 0
for i in range(0, len(quantity)):
    if (quantity[i] > 15):
        total += quantity[i]
print(total) # 219

#5
x = [1, 2, 4, 6, 9, 10, 14, 15, 17]
for i in range(0, len(x)):
    if (x[i]%2 == 0):
        x[i] = 4*i
    elif (x[i]%3 == 0):
        x[i] = 9*i
else:
        x[i] *= 2
print(x)    # [1, 4, 8, 12, 36, 20, 24, 63, 34]