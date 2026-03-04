class ContaBancaria:
    def __init__(self, titular, saldo_inicial):
        self.titular = titular
        self.saldo = saldo_inicial

    def depositar(self, valor):
        self.saldo += valor

    def sacar(self, valor):
        if valor <= self.saldo:
            self.saldo -= valor
        else:
            print(f"Saldo insuficiente para {self.titular}")

    def obter_saldo(self):
        return self.saldo

    def gerar_resumo(self):
        return f"Conta: {self.titular}, Saldo: R$ {self.saldo}"

def calcular_saldo_total(lista_contas):
    return sum(conta.saldo for conta in lista_contas)

def encontrar_titular_maior_saldo(lista_contas):
    conta_rica = max(lista_contas, key=lambda conta: conta.saldo)
    return conta_rica.titular

conta_alice = ContaBancaria("Alice", 500)
conta_bob = ContaBancaria("Bob", 1200)
conta_charlie = ContaBancaria("Charlie", 700)

conta_alice.depositar(200)
conta_bob.sacar(200)

print(f"Saldo atual da Alice: {conta_alice.obter_saldo()}")
print(conta_bob.gerar_resumo())

todas_as_contas = [conta_alice, conta_bob, conta_charlie]

saldo_total_sistema = calcular_saldo_total(todas_as_contas)
nome_maior_saldo = encontrar_titular_maior_saldo(todas_as_contas)

print(f"Saldo total de todas as contas: R$ {saldo_total_sistema}")
print(f"Pessoa com maior saldo: {nome_maior_saldo}")