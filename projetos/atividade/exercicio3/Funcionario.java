package atividade.exercicio3;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract double calculaSalario();
}

class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, String matricula, int horasTrabalhadas, double valorHora) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calculaSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }
}

class FuncionarioSalariado extends Funcionario {
    private double salarioFixo;

    public FuncionarioSalariado(String nome, String matricula, double salarioFixo) {
        super(nome, matricula);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calculaSalario() {
        return this.salarioFixo;
    }
}