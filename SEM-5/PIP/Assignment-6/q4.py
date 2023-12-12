
def to_title_case(s):
    modified = ""
    words = s.split(" ")
    
    for word in words:
        modified = modified + word[0].upper() + word[1:].lower() + " "
    
    return modified

sen = "This is a teSt And I thiNK it WorKS"
ans = to_title_case(sen)
print(ans)