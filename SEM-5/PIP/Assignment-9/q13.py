
def a():
    f=open('file1','w') 
    f.write('failure is a part of success') 
    f = open("file1", "r")
    print(f.read(4))
    f.close()

def b():
    f=open('file1','w') 
    f.write('failure is a part of success') 
    f = open("file1", "r")
    print(f.read())
    f.close()

a()
b()

# a -> fail
# b -> failure is a part of success