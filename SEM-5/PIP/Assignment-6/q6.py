address = 'B-6, Lodhi road, Delhi'

a = len(address)
b = address[17:-1]
c = address[-len(address): len(address)]
d = address[:-12] + address[-12:]
e = address.find('Delhi')
f = address.swapcase()
g = address.split(',')
h = address.isalpha()

print(f"a. Length of address: {a}")
print(f"b. Substring from index 17 to second-to-last character: {b}")
print(f"c. Whole string using negative indices: {c}")
print(f"d. Concatenation of substrings: {d}")
print(f"e. Index of 'Delhi' (case-sensitive): {e}")
print(f"f. String with swapped case: {f}")
print(f"g. Split string using commas: {g}")
print(f"h. Is the string alphabetic? {h}")

"""
a. Length of address: 22
b. Substring from index 17 to second-to-last character: Delh
c. Whole string using negative indices: B-6, Lodhi road, Delhi
d. Concatenation of substrings: B-6, Lodhi road, Delhi
e. Index of 'Delhi' (case-sensitive): 17
f. String with swapped case: b-6, lODHI ROAD, dELHI
g. Split string using commas: ['B-6', ' Lodhi road', ' Delhi']
h. Is the string alphabetic? False
"""