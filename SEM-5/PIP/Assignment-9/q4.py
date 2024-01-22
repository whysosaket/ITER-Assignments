
try:
    f1 = open("file1", "r")
    f2 = open("file2", "w")

    lines = f1.readlines()

    for i in range(0, len(lines), 2):
        f2.write(lines[i])

    f1.close()
    f2.close()

except IOError:
    print("There has been some IO Error")

finally:
    print("Program Terminated")
    
