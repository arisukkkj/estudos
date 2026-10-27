package atividade.exercicio6;

public class RelatorioFinanceiro implements Imprimivel {
    private double totalReceita;
    private double totalDespesa;

    public RelatorioFinanceiro(double totalReceita, double totalDespesa) {
        this.totalReceita = totalReceita;
        this.totalDespesa = totalDespesa;
    }
    @Override
    public void imprimir() {
        double balanco = totalReceita - totalDespesa;
        System.out.println("Receita Total: R$ " + totalReceita);
        System.out.println("Despesa Total: R$ " + totalDespesa);
        System.out.println("Balanço Consolidado: R$ " + balanco);
    }
}