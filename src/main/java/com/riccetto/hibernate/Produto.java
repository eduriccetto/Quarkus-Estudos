package com.riccetto.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

// ---------------------------------------  Entidade
@Entity
public class Produto {

    // -------------   Atributos
    @Id
    private Long id;
    private String nome;

    // -------------    Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
