import re

test = "This is a test string"

def a_reverse_string(s):
    modified = ""
    n = len(s)
    for i in range(n-1,-1, -1):
        modified += s[i]
    return modified

def b_reverse(s):
    words = s.split(" ")
    modified = ""
    for i in range(len(words)-1, -1, -1):
        modified+=words[i]+" "
    return modified

def check_symmetry(s):
    n = len(s)

    if n%2==0:
        return s[:n//2] == s[n//2:] 
    else:
        return s[:n//2] == s[n//2+1:]
    
def check_palindrome(s):
    n = len(s) - 1
    i = 0
    while i<n:
        if s[i]!=s[n]:
            return False
        i+=1
        n-=1
    return True

def del_i(s, i):
    modified = s[:i] + s[i+1:]
    return modified

def count_cons_vow(s):
    s = s.lower()
    vows = re.findall("[aeiou]",s)
    s1 = "".join(re.findall("[a-z]*",s))
    cons = re.findall("[^aeiou]",s1)
    print("Vowels: ", vows)
    print("Consonents: ",cons)

def length(s):
    count = 0
    for i in s:
        count+=1
    return count

def one_alphadigit(s):
    match1 = re.search("\d",s)
    match2 = re.search("[a-zA-Z]",s)
    return match1 != None and match2 != None

def remove_duplicates(s):
    my_set = set()
    modified = ""
    for i in s:
        if not i in my_set:
            my_set.add(i)
            modified += i
        elif i==' ':
            modified += ' '
    return modified
    
def count_frequency(s):
    dict = {}
    for i in s:
        if i in dict:
            dict[i] += 1
        else:
            dict[i] = 1
    print(dict)

def max_freq(s):
    m = 0
    max_char = None
    dict = {}
    for i in s:
        if i in dict:
            dict[i] += 1
        else:
            dict[i] = 1

        if dict[i]>m:
                m = dict[i]
                max_char = i
    return max_char

a = "abcacdc123ac3"
ans = max_freq(a)
print(ans)
