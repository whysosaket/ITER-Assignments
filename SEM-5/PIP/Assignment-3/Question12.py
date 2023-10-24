
def pattern_a(n):
    for i in range(1,n+1):
        for j in range (1,i+1):
            print(j,end=" ")
        print("")

def pattern_b(n):
    for i in range(1,n+1):
        for j in range (1,2*n):
            if i>abs(n-j):
                print(1+abs(n-j),end=" ")
            else:
                print(end="  ")
        print("")

def pattern_c(n):
    for i in range(n,0,-1):
        for j in range (i,0,-1):
            print(j,end=" ")
        print("")

def pattern_d(n):
    for i in range(1,n+1):
        for j in range (1,i+1):
            print(i,end=" ")
        print("")


def pattern_e(n):
    for i in range(1,n+1):
        for j in range (1,n+1):
            if j >= i:
                print(j,end=" ")
            else:
                print(end="  ")
        print("")


def pattern_f(n):
    for i in range(0,n):
        for j in range (0,n):
            if i%(n-1)==0 or j%(n-1)==0:
                print('*',end="  ")
            else:
                print(end="   ")
        print("")


def pattern_g(n):
    for i in range(0,n):
        for j in range (0,n):
            print('*',end="  ")
        print("")


def pattern_h(n):
    for i in range(1,n+1):
        for j in range (1,2*n):
            if i>abs(n-j):
                print('*',end="  ")
            else:
                print(end="   ")
        print("")


def pattern_i(n):
    for i in range(1,n+1):
        f = 2*n-1
        for j in range (1,2*n):
            k = min(j,f)
            if k==i or i==1:
                print("*", end=" ")
            else:
                print(end="  ")
            f -= 1
        print("")

    
def pattern_j(n):
    for i in range(1,n+1):
        f = 2*n-1
        for j in range (1,2*n):
            k = min(j,f)
            if k>=i:
                print("*", end=" ")
            else:
                print(end="  ")
            f -= 1
        print("")


def pattern_k(n):
    for i in range(0,n-1):
        for j in range (1,2*n):
            if i==abs(n-j):
                print('*',end="  ")
            else:
                print(end="   ")
        print("")

    for i in range(1,n+1):
        f = 2*n-1
        for j in range (1,2*n):
            k = min(j,f)
            if k==i:
                print("*", end="  ")
            else:
                print(end="   ")
            f -= 1
        print("")


def pattern_l(n):
    for i in range(1,n):
        for j in range (1,2*n):
            if i>abs(n-j):
                print('*',end="  ")
            else:
                print(end="   ")
        print("")

    for i in range(1,n+1):
        f = 2*n-1
        for j in range (1,2*n):
            k = min(j,f)
            if k>=i:
                print("*", end="  ")
            else:
                print(end="   ")
            f -= 1
        print("")


def pattern_m(n):
    for i in range(1,n+1):
        for j in range (1,n+1):
            if j >= i:
                print('$',end=" ")
            else:
                print(end="  ")
        print("")


def pattern_n(n):
    for i in range(1,n+1):
        for j in range (1,n+1):
            if n-j < i:
                print('#',end=" ")
            else:
                print(end="  ")
        print("")

pattern_n(6)