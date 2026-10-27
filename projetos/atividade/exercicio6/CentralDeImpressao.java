package atividade.exercicio6;

public class CentralDeImpressao {
    
    public void enviarParaImpressora(Imprimivel item) {
        item.imprimir(); 
    }
    public static void main(String[] args) {
        Imprimivel relatorio = new RelatorioFinanceiro(32000.00, 18300.50);
        Imprimivel contrato = new ContratoServico("Dodali", "Dodali Studios Ltda");
        CentralDeImpressao central = new CentralDeImpressao();
        
        central.enviarParaImpressora(relatorio);
        central.enviarParaImpressora(contrato);
    }
}
