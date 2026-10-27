package atividade.exercicio2;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("RTX 5090", 32000.0); //queria colocar as variaveis la no outro arquivo e só apresentar aq
        
        ProdutoImportado produtoImportado = new ProdutoImportado("RTX 5090", 32000.0);

        System.out.println("Produto: " + produto.nome);
        System.out.println("Valor do Produto Nacional: R$ " + produto.getDescricao());
        System.out.println("Valor do Produto importado: R$ " + produtoImportado.precoBase);
        System.out.println("Valor do Produto importado com impostos: R$ " + produtoImportado.getDescricao());

    }
}