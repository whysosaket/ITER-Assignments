import re

def count_words(s):
    regex = "\w+"
    words = re.findall(regex, s)
    return len(words)

sen = "This is another test message to test the number of words in this line"
ans = count_words(sen)
print(ans)