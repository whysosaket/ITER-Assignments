

def print_table(n):
    for i in range(10):
        print(f"{n}x{i+1}={n*(i+1)}")

def main():
    n = int(input("Enter N: "))
    print_table(n)

if __name__ == "__main__":
    main()