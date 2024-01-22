import re

try:
    f1 = open("weights", "r")
    f2 = open("prices", "r")

    l1 = f1.readlines()
    l2 = f2.readlines()

    assert len(l1) == len(l2)

    f3 = open("items", "w")
    
    for i in range(len(l1)):
        val1 = re.search("\d+(\.?\d+)?", l1[i])
        val2 = re.search("\d+(\.?\d+)?", l2[i])
        val1 = val1.group()
        val2 = val2.group()
        val = float(val1)/float(val2)
        f3.write(str(val)+"\n")
    
    f1.close()
    f2.close()
    f3.close()

except AssertionError:
    print("Files are not of equal size")

except IOError:
    print("IO Exception")

except TypeError:
    print("Some Type Error")

except AttributeError:
    print("Attribute Error")

finally:
    print("Program Terminated")
    