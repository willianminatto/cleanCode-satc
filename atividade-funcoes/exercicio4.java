class Produto {
    private final String nome;
    private final double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    Produto aplicarDesconto(double desconto) {
        return new Produto(nome, preco - desconto);
    }

    String getNome() {
        return nome;
    }

    double getPreco() {
        return preco;
    }
}

class CarrinhoDeCompras {
    private Produto produto;

    CarrinhoDeCompras(Produto produto) {
        this.produto = produto;
    }

    void adicionarProdutoAoCarrinho(Produto novoProduto) {
        this.produto = novoProduto;
    }

    void finalizarCompra() {
        produto = produto.aplicarDesconto(10.0);
    }

    void mostrarDetalhes() {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Laptop", 1500.00);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(produto1);

        Produto produto2 = new Produto("Smartphone", 1200.00);
        carrinho.adicionarProdutoAoCarrinho(produto2);

        carrinho.finalizarCompra();
        carrinho.mostrarDetalhes();
    }
}