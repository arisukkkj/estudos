package atividade.exercicio5;

class CatracaEletronica {
    public void liberarEntrada(Validavel dispositivo, String credencial) {
        if (dispositivo.validar(credencial)) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Acesso Negado!");
        }
        System.out.println("                         ");
    }
}

class TestaCatraca {
    public static void main(String[] args) {
        Validavel cartao = new CartaoAcesso("TAG4444");
        Validavel biometria = new Biometria("HASH_DIGITAL_PYT");

        CatracaEletronica catraca = new CatracaEletronica();

        System.out.println("TESTE DE CARTOES");
        catraca.liberarEntrada(cartao, "TAG676767"); 
        catraca.liberarEntrada(cartao, "TAG4444");

        System.out.println("TESTE DE BIOMETRIA");
        catraca.liberarEntrada(biometria, "HASH_DIGITAL_PYT"); 
    }
}