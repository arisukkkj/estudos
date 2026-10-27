package atividade.exercicio5;

interface Validavel {
    boolean validar(String credencial);
}

class CartaoAcesso implements Validavel {
    private String codigoTag;

    public CartaoAcesso(String codigoTag) {
        this.codigoTag = codigoTag;
    }
    @Override
    public boolean validar(String credencial) {
        return this.codigoTag.equals(credencial); // equals rever
    }
}

class Biometria implements Validavel {
    private String hashDigital;

    public Biometria(String hashDigital) {
        this.hashDigital = hashDigital;
    }
    @Override
    public boolean validar(String credencial) {
        return this.hashDigital.equals(credencial);
    }
}