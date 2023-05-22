import numpy as np

x=np.arange(1,10)
print(x)

print(x[x<4])

print(x[(x>5) & (x%2==0)]) # números pares mayores a 5
y = (x>5)&(x%2==0)
print(y)

x = np.arange(1,10)
print(x.sum()) # suma
print(x.min()) # valor mínimo
print(x.max()) # máximo
y = x*2

print(y)