package atividade.exercicio6;

public class ContratoServico implements Imprimivel {
    private String contratante;
    private String contratado;

    public ContratoServico(String contratante, String contratado) {
        this.contratante = contratante;
        this.contratado = contratado;
    }
    @Override
    public void imprimir() {
        System.out.println("Contratante: " + contratante);
        System.out.println("Contratado: " + contratado);
    }
}