import re

f1 = open("file1", "r")
text = f1.read()

count_vow = re.findall("[aeiou]", text)
count_words = re.findall("\w+", text)

print("No of words", len(count_words))
print("No of vowels", len(count_vow))

f1.close()