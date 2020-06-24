package com.prograiii2020.swing.Model;

import javax.persistence.*;

@Entity
@Table(name = "Diccionario")

public class DeccModel {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "INGLES", length = 200, nullable = false)
    private String ingles;

    @Column(name = "PORTUGUES", length = 200, nullable = false)
    private String portugues;
    @Column(name = "WORD", length = 200, nullable = false)
    private String word;

    public DeccModel(String ingles,String portugues,String word){
        this.ingles = ingles;
        this.portugues=portugues;
        this.word=word;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getPortugues() {
        return portugues;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
