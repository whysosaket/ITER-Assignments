greeting = 'Good Morning. Have a Good Day!!'

a = greeting.count('Good')
b = greeting.find('a')
c = greeting.rfind('a')
d = greeting.capitalize()
e = greeting.lower()
f = greeting.upper()
g = greeting.swapcase()
h = greeting.istitle()
i = greeting.replace('Good', 'Sweet')
j = greeting.strip()
k = greeting.split()
l = greeting.partition('.')
m = greeting.startswith('good')
n = greeting.endswith('!!')

print(f"a. Count of 'Good' in greeting: {a}")
print(f"b. Index of 'a' in greeting: {b}")
print(f"c. Last index of 'a' in greeting: {c}")
print(f"d. Capitalized greeting: {d}")
print(f"e. Lowercased greeting: {e}")
print(f"f. Uppercased greeting: {f}")
print(f"g. Swapped case greeting: {g}")
print(f"h. Is the greeting in title case? {h}")
print(f"i. Replacing 'Good' with 'Sweet': {i}")
print(f"j. Stripped greeting: {j}")
print(f"k. Split greeting: {k}")
print(f"l. Partitioning greeting at '.': {l}")
print(f"m. Does greeting start with 'good'? {m}")
print(f"n. Does greeting end with '!!'? {n}")

"""
a. Count of 'Good' in greeting: 2
b. Index of 'a' in greeting: 15
c. Last index of 'a' in greeting: 27
d. Capitalized greeting: Good morning. have a good day!!
e. Lowercased greeting: good morning. have a good day!!
f. Uppercased greeting: GOOD MORNING. HAVE A GOOD DAY!!
g. Swapped case greeting: gOOD mORNING. hAVE A gOOD dAY!!
h. Is the greeting in title case? False
i. Replacing 'Good' with 'Sweet': Sweet Morning. Have a Sweet Day!!
j. Stripped greeting: Good Morning. Have a Good Day!!
k. Split greeting: ['Good', 'Morning.', 'Have', 'a', 'Good', 'Day!!']
l. Partitioning greeting at '.': ('Good Morning', '.', ' Have a Good Day!!')
m. Does greeting start with 'good'? False
n. Does greeting end with '!!'? True
"""