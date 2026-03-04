def esta_vazia(texto):
    return not texto

string_para_teste = ""
resultado_verificacao = esta_vazia(string_para_teste)

print(f"A string está vazia? {resultado_verificacao}")