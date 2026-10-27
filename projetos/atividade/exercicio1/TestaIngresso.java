package atividade.exercicio1;

public class TestaIngresso {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Ingresso(50.00, "Show de Rock");
        
        IngressoVIP ingressoVIP = new IngressoVIP(50.00, "Show de Rock", 30.00);

        System.out.println("Evento: " + ingressoNormal.nomeEvento);
        System.out.println("Valor do Ingresso Normal: R$ " + ingressoNormal.getValorReal());
        System.out.println("Valor do Ingresso VIP: R$ " + ingressoVIP.getValorReal());
    }
}