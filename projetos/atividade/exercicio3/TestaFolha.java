package atividade.exercicio3;

public class TestaFolha {
    public static void main(String[] args) {
        
        Funcionario[] funcionarios = {
            new FuncionarioHorista("Pedro Henrique", "H42", 220, 17.0),
            new FuncionarioSalariado("Ana Julia", "S67", 4400.0),
        };

        System.out.println("PAGAMENTO");
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.nome);
            System.out.println("Matrícula: " + f.matricula);
            System.out.println("Salário Final: R$ " + f.calculaSalario());
            System.out.println("                                ");

        }
    }
}