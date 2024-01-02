def interleavingStrings(s1, s2, s3):
    if s1 == "" and s2 == "":
        print(s3)
    else:
        if s1 != "":
            interleavingStrings(s1[1:], s2, s3 + s1[0])
        if s2 != "":
            interleavingStrings(s1, s2[1:], s3 + s2[0])
    
s1 = input("Enter s1: ")
s2 = input("Enter s2: ")
interleavingStrings(s1, s2, "")