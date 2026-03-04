PI = 3.14159

def calcular_area_circulo(raio):
    area = PI * (raio ** 2)
    return area

raio_do_circulo = 5
resultado_area = calcular_area_circulo(raio_do_circulo)

print(f"A área do círculo é: {resultado_area}")