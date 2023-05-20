matriz = [
    [11, 2, 4],
    [4, 5, 6],
    [10, 8, -12]
]

# Imprimir la matriz por pantalla
for fila in matriz:
    for elemento in fila:
        print(elemento, end=' ')
    print()


# Recorrer la matriz con los índices
for i, fila in enumerate(matriz):
    for j, elemento in enumerate(fila):
        print("El elemento en la posición [", i, "][", j, "] es:", elemento)


print(matriz[0][0])
d1=0
d2=0
for i in range(0,3):
    d1 += matriz[i][i]
    d2 += matriz[i][3-i-1]

print(d1)
print(d2)
print(abs(d2-d1))
