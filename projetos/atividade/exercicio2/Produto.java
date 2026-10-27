package atividade.exercicio2;

public class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }
    public String getDescricao() { //sera que eu não deveria deixar isso em branco? só getdeescricao() ?

        return "Placa de video ultra potente" + " Valor final: ";
    }
}

class ProdutoImportado extends Produto {
    private double taxaAlfandegaria;

    public ProdutoImportado(String nome,double precoBase) {
        super(nome, precoBase);
        this.taxaAlfandegaria = precoBase * 0.30;
    } // bizarrisse doida aqui
    @Override
    public String getDescricao() {
        
        return super.getDescricao() + (precoBase + taxaAlfandegaria) ;
}

}