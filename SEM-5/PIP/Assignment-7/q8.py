address = 'B-6, Lodhi road, Delhi'
list1 = [1, 2, 3]
list2 = ['a', 1, 'z', 26, 'd', 4]
tuple1 = ('a', 'e', 'i', 'o', 'u')
tuple2 = ([2, 4, 6, 8], [3, 6, 9], [4, 8], 5) 
dict1 = {'apple': 'red', 'mango': 'yellow', 'orange': 'orange'}
dict2 = {'X': ['eng', 'hindi', 'maths', 'science'], 'XII': ['english', 'physics', 'chemistry', 'maths']}

#1
#list1[3] = 4 # Index out of range

#2
print(list1 * 2)    # [1, 2, 3, 1, 2, 3]

#3
# print(min(list2))    # TypeError 

#4
print(max(list1))    # 3   

#5
print(list(address)) # List of all individual characters

#6
list2.extend(['e', 5])
print(list2)    # ['a', 1, 'z', 26, 'd', 4, 'e', 5]

#7
list2.append(['e', 5])
print(list2)    # ['a', 1, 'z', 26, 'd', 4, ['e', 5]] # Adds new list as an element

#8
names = ['rohan', 'mohan', 'gita']
names.sort(key= len)
print(names)    # ['gita', 'rohan', 'mohan']

#9
list3 = [(x * 2) for x in range(1, 11)]
print(list3)    # [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

#10
del list3[1:]
print(list3)    # [2]

#11
list4 = [ x+y for x in range(1,5) for y in range(1,5)]
print(list4)    # [2, 3, 4, 5, 3, 4, 5, 6, 4, 5, 6, 7, 5, 6, 7, 8]

#12
# tuple2[3] = 6 # TypeError: 'tuple' object does not support item assignment

#13
# tuple2.append(5)    # AttributeError: 'tuple' object has no attribute 'append'

#14
# t1 = tuple2 +(5)  # TypeError: can only concatenate tuple (not "int") to tuple

#15
ans = ','.join(tuple1)
print(ans)  # a,e,i,o,u

#16
lz = list(zip(['apple', 'orange'], ('red','orange')))
print(lz)   # [('apple', 'red'), ('orange', 'orange')]

#17
print(dict2['XII']) # ['english', 'physics', 'chemistry', 'maths']

#18
dict2['XII'].append('computer science')
print(dict2)  # {'X': ['eng', 'hindi', 'maths', 'science'], 'XII': ['english', 'physics', 'chemistry', 'maths', 'computer science']}

#19
ans = 'red' in dict1
print(ans)  # True

#20
ans = list(dict1.items())
print(ans)  # [('apple', 'red'), ('mango', 'yellow'), ('orange', 'orange')]

#21
ans = list(dict1.keys())
print(ans)  # ['apple', 'mango', 'orange']

#22
ans = dict2.get('XI', 'None')
print(ans)  # None

#23
dict1.update({'kiwi':'green'})
print(dict1)    # {'apple': 'red', 'mango': 'yellow', 'orange': 'orange', 'kiwi': 'green'}