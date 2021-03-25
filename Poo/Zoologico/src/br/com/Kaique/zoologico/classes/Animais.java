package br.com.Kaique.zoologico.classes;

/**
 *
 * @author Kaique
 */
public class Animais {

    private String nome;
    private String especie;
    private int idade;

    public Animais(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirBarulho() {

        System.out.println("Fazendo barulho....");

    }

    public boolean ehAdulto() {
        return idade >= 1;

    }
}
