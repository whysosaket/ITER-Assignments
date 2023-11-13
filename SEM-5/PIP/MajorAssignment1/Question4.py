# Saket Aryan
# 2141001066
# CSE Z
# Serial Number: 2

import random

def generate_random_password():
    password_length = random.randint(7, 10)
    password = ''
    for _ in range(password_length):
        letter = chr(random.randint(33,127))
        password += letter
    return password

def main():
    random_password = generate_random_password()
    print("Password:", random_password)

if __name__ == "__main__":
    main()
