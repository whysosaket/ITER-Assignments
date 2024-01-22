

def a():
    try:
        f = open("file1s.txt", "r") 
    except IOError:
        print("Problem with Input Output...\n")
    else:
        print("No Problem with Input Output...")

def b():
    try:
        f = open("file1s.txt", "w") 
    except IOError:
        print("Problem with Input Output...\n")
    else:
        print("No Problem with Input Output...")

a()
b()
"""
a -> Problem with Input Output...
b -> No Problem with Input Output
"""