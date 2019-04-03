package br.ufjf.dcc193.exemplo01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 * Pessoa
 */
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    
    private String nome;
    private Integer idade;

    Pessoa (){
        
    }
    Pessoa(String nome, Integer idade){
        this.nome=nome;
        this.idade = idade;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
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
    @Override
    public String toString() {
        return this.nome+" "+this.idade+" anos id = ["+this.id+"]";
    }
}