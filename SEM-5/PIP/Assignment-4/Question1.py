import pdb;
# pdb.set_trace()

def summation(n): 
    total = 0
    for count in range(1,n+1):  # for count in range(1,n):
        total += count
    return total
def main(): 
    n = int(input("Enter number of terms: "))
    total = summation(n)
    print("Sum of first",n,"positive integers:",total)

if __name__ =='__main__':
    main ( )