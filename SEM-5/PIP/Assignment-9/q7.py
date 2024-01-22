def inverse1(): 
    try:
        num = input("Enter the number: ")
        num = float(num)
        inverse = 1.0 / num
    except ValueError: print("ValueError")
    except TypeError: print("TypeError")
    except ZeroDivisionError: print("ZeroDivisionError")
    except: print("Any other Error")
    else: print(inverse)
    finally: print("Function Inverse Completed")


inverse1()

"""
a. 5 -> 0.2
b. 0 -> ZeroDivisionError
c. 2.0 -> 0.5
d. x -> ValueError
e. None -> ValueError
"""