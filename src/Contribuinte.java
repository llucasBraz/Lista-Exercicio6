package listas.lista01;

public class Contribuinte {
    private int idade;
    private String sexo;
    private int tempoContribuicao;

    public Contribuinte(int idade, String sexo, int tempoContribuicao) {
        this.idade = idade;
        this.sexo = sexo;
        this.tempoContribuicao = tempoContribuicao;
    }

    public boolean podeAposentar() {
        if (sexo.equals("F")) {
            return idade >= 62 && tempoContribuicao >= 15;
        } else if (sexo.equals("M")) {
            return idade >= 65 && tempoContribuicao >= 20;
        }
        return false;
    }
}
