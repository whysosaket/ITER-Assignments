
def find_average():
    count = 0
    sum = 0

    while True:
        n = int(input("Enter Number: "))
        if n==0:
            if count==0:
                print("error: First Number is Zero")
                exit()
            sum/=count
            print("Average:",sum)
        sum+=n
        count+=1

find_average()