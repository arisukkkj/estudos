package atividade.exercicio1;

public class Ingresso {
    protected double valor;
    protected String nomeEvento;

    public Ingresso(double valor, String nomeEvento) {
        this.valor = valor;
        this.nomeEvento = nomeEvento;
    }
    public double getValorReal() {
        return this.valor;
    }
}

 class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(double valor, String nomeEvento, double valorAdicional) {
        super(valor, nomeEvento);
        this.valorAdicional = valorAdicional;
    } // bizarrisse doida aqui

   @Override
    public double getValorReal() {
        return super.getValorReal() + valorAdicional;
}
}

