MEDIA_MINIMA_APROVACAO = 60

def calcular_media(lista_de_notas):
    return sum(lista_de_notas) / len(lista_de_notas)

def verificar_aprovacao(media_final):
    esta_aprovado = media_final >= MEDIA_MINIMA_APROVACAO
    return esta_aprovado

notas_estudante = [70, 80, 50]
media_calculada = calcular_media(notas_estudante)
aprovado = verificar_aprovacao(media_calculada)

print(f"Média: {media_calculada} - Aprovado: {aprovado}")