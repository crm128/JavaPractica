arr = [1,1,3,2,1]
f = []
for i in range(0,100):
    f.append(0)

for x in range(0,len(arr)):
    f[arr[x]] += 1


print(f)

