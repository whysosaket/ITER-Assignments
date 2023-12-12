import re

string1 = 'Python Programming Language'

match1 = re.search(r'......m?', string1)
print(match1.group())

match2 = re.search(r'......m{1,3}', string1)
print(match2.group())

match3 = re.search(r'.*Language$', string1)
print(match3.group())

match4 = re.search(r'\w*\s\w*', string1)
print(match4.group())

match5 = re.search(r'.*', string1)
print(match5.group())

"""
1. Python
2. Programm
3. Python Programming Language
4. Python Programming
5. Python Programming Language
"""

string2 = 'Car Number DL5645'

match1 = re.search(r'\w\w?\d{1,4}', string2)
print(match1.group())

match2 = re.search(r'.*5', string2)
print(match2.group())

match3 = re.search(r'.*5?', string2)
print(match3.group())

match4 = re.search(r'\d{3}', string2)
print(match4.group())

match5 = re.search(r'^C.*5$', string2)
print(match5.group())


"""
1. DL5645
2. Car Number DL5645
3. Car Number DL5645
4. 564
5. Car Number DL5645
"""

string3 = 'cdcccdcddd343344aabb'

match1 = re.search(r'(c|d)*\d*(a|b)*', string3)
print(match1.group())

match2 = re.search(r'(cd)*d', string3)
print(match2.group())

match3 = re.search(r'(cc|cd)*(3|4)*(aa|bb)', string3)
print(match3.group())

match4 = re.search(r'(cc|cd|dd)*(3|4)*(aa|bb)', string3)
print(match4.group())

match5 = re.search(r'(cc|cd|dd)*(3|4)*(aa|bb)*', string3)
print(match5.group())

"""
cdcccdcddd343344aabb
d
343344aa
cdcccdcddd343344aa
cdcccdcddd343344aabb
"""