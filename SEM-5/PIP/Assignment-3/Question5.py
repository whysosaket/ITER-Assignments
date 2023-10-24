noise = float(input("Enter Noise: "))

noise_name = ['Jackhammer', 'Gas Lawnmower', 'Alarm Clock', 'Quiet Room']
noise_ranges = [130.0,106.0,70.0,40.0]

if noise in noise_ranges:
    index = noise_ranges.index(noise)
    print("Noise: ", noise_name[index])
    exit()

if noise > 130:
    print("Louder than", noise_name[0])
    exit()
elif noise < 40:
    print("Quieter than", noise_name[3])
    exit()

lower_range = 0

for i in noise_ranges:
    if i - noise < 0:
        index = noise_ranges.index(i)
        lower_range = index
        break

upper_range = lower_range-1

print("Noise between range of",noise_name[lower_range],"and",noise_name[upper_range])
