
def to_upper(s):
    if(not s.islower()):
        return s.upper()
    else:
        return "Invalid String"
    
s = "SksjasS"
print(to_upper(s))