class CalculadoraSalario:
    def calcular_pagamento_total(self, horas_trabalhadas, valor_hora):
        return horas_trabalhadas * valor_hora

calculadora = CalculadoraSalario()

salario_final = calculadora.calcular_pagamento_total(horas_trabalhadas=40, valor_hora=160)

print(f"O salário total é: R$ {salario_final}")