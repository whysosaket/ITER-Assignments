human_years = int(input("Enter Age in Human Years: "))
dog_years = 0

if human_years<0:
    print("Invalid Age")
    exit()

if human_years<=21:
    dog_years = human_years/10.5
else:
    dog_years = 2
    dog_years += (human_years-21)/4

print('Dog Years: ', dog_years)