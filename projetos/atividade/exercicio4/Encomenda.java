package atividade.exercicio4;

public abstract class Encomenda {
    protected double pesoKg;
    protected String destino;

    public Encomenda(double pesoKg, String destino) {
        this.pesoKg = pesoKg;
        this.destino = destino;
    }

    public abstract double calculaFrete();

    public void exibeEtiqueta() {
        System.out.println("Destino: " + this.destino);
        System.out.println("Peso Kg: " + this.pesoKg);
        System.out.println("Valor do Frete: R$ " + this.calculaFrete());
    }
}

class EncomendaNormal extends Encomenda {
    public EncomendaNormal(double pesoKg, String destino) {
        super(pesoKg, destino);
    }

    @Override
    public double calculaFrete() {
        return this.pesoKg * 4.50;
    }
}

class EncomendaExpressa extends Encomenda {
    public EncomendaExpressa(double pesoKg, String destino) {
        super(pesoKg, destino);
    }

    @Override
    public double calculaFrete() {
        return (this.pesoKg * 8.00) + 20.00;
    }
}

class GerenciadorLogistico {
    public void processarEnvio(Encomenda e) {
        e.exibeEtiqueta();
        System.out.println("                            ");
    }
}

