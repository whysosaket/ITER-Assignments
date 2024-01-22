
f1 = open("file1", "r")
f2 = open("file2", "w")

for i in f1.readlines():
    f2.write(i)

f1.close()
f2.close()