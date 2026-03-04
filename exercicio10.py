DIAS_DA_SEMANA = [
    'Domingo', 
    'Segunda-feira', 
    'Terça-feira', 
    'Quarta-feira', 
    'Quinta-feira', 
    'Sexta-feira', 
    'Sábado'
]

def obter_nome_dia(indice):
    return DIAS_DA_SEMANA[indice]

indice_procurado = 2
dia_selecionado = obter_nome_dia(indice_procurado)

print(f"O dia correspondente ao índice {indice_procurado} é: {dia_selecionado}")