package br.ufjf.dcc193.exemplo01;

/**
 * Pessoa
 */
public class Pessoa {

    private String nome;
    private Integer idade;

    Pessoa (){
        this.nome = "";
        this.idade= 0;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
  
    public Integer getIdade() {
        return idade;
    }
}