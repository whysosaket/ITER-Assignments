import re

f = open("file1", "r")

text = f.read()

alpha = re.findall("[a-zA-Z]", text)
alpha = len(alpha)

blank = text.count(" ")

low = re.findall("[a-z]", text)
low = len(low)

uppr = re.findall("[A-Z]", text)
uppr = len(uppr)

vow_start = 0
for i in text.split(" "):
    exp = re.search("^[aeiou].*", i)
    if exp != None:
        vow_start+=1

beaut = text.count("beautiful")

print("Alphabets: ", alpha)
print("Blanks: ", blank)
print("Lowercase: ", low)
print("Uppercase: ", uppr)
print("Starts with vowel: ", vow_start)
print("Beautiful: ", beaut)

f.close()

