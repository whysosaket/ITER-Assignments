
vehicles = {'Bicycle', 'Scooter', 'Car', 'Bike', 'Truck', 'Bus', 'Rickshaw'}
heavyVehicles = {'Truck', 'Bus'}
lightVehicles = {'Rickshaw', 'Scooter', 'Bike', 'Bicycle'}

#1
lytVehicles = vehicles - heavyVehicles
print(lytVehicles)   # {'Bicycle', 'Scooter', 'Car', 'Bike', 'Rickshaw'}

#2
hvyVehicles = vehicles - lightVehicles
print(hvyVehicles)   # {'Truck', 'Bus', 'Car'}

#3
averageWeightVehicles = lytVehicles & hvyVehicles
# averageWeightVehicles = hvyVehicles.intersection(lytVehicles)
print(averageWeightVehicles)    # {'Car'}

#4
transport = lightVehicles | heavyVehicles
transport = lightVehicles.union(heavyVehicles)
print(transport)    # {'Truck', 'Bicycle', 'Scooter', 'Bike', 'Bus', 'Rickshaw', 'Car'}

#5
transport.add('Car')
print(transport)   # {'Truck', 'Bicycle', 'Scooter', 'Bike', 'Bus', 'Rickshaw', 'Car'}

#6
for i in vehicles:
    print(i)

#7
ans = len(vehicles)
print(ans)  # 7

#8
ans = min(vehicles)
print(ans)  # Bicycle

#9
ans = set.union(vehicles, lightVehicles, heavyVehicles)
print(ans)  # {'Truck', 'Bicycle', 'Scooter', 'Bike', 'Bus', 'Rickshaw', 'Car'}