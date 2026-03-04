def buscar_maior_numero_par(lista_de_numeros):
    maior_par = None
    
    for numero in lista_de_numeros:
        if numero % 2 == 0:
            if maior_par is None or numero > maior_par:
                maior_par = numero
                
    return maior_par

numeros_teste = [3, 10, 7, 8, 15]
resultado = buscar_maior_numero_par(numeros_teste)

print(f"O maior número par é: {resultado}")