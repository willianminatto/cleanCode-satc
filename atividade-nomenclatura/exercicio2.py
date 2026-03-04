def encontrar_maior_numero(lista_de_numeros):
    maior_valor = lista_de_numeros[0]
    
    for numero in lista_de_numeros:
        if numero > maior_valor:
            maior_valor = numero
            
    return maior_valor

numeros_para_teste = [3, 7, 2, 9, 4]
maior_numero_encontrado = encontrar_maior_numero(numeros_para_teste)

print("Maior número:", maior_numero_encontrado)