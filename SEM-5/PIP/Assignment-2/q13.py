def is_colinear(a=[0,0], b=[0,0], c=[0,0]):
    det = a[0] * (b[1] - c[1]) + b[0] * (c[1] - a[1]) + c[0] * (a[1] - b[1])
    
    return det == 0

point_a = [1, 1]
point_b = [2, 2]
point_c = [3, 3]

result = is_colinear(point_a, point_b, point_c)
print(f"The points are collinear: {result}")