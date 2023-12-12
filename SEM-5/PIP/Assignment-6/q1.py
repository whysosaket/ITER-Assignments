
def modify(s):
    modified = ""
    n = len(s)
    for i in range(0, n):
        if s[i] in s[:i]:
            modified = modified + "*"
        else:
            modified = modified + s[i]
    return modified

a = "balloon"
ans = modify(a)
print(ans)