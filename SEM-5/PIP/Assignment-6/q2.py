

def is_anagram(a,b):
    if (len(a)!=len(b)):
        return False
    
    a = a.upper()
    b = b.upper()

    set_a = [0]*26
    set_b = [0]*26
    
    for i in a:
        set_a[ord(i)-ord('A')] += 1
    
    for i in b:
        set_b[ord(i)-ord('A')] += 1

    for i in range(0,26):
        if set_a[i]!=set_b[i]:
            return False
    return True


a = "SAKA"
b = "KAES"

ans = is_anagram(a,b)
print(ans)