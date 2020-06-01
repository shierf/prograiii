package com.progra32020.swring.Model;

import javax.persistence.*;

@Entity
@Table (name="Alphabet")
public class AlphabetModel {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column (name = "letter",length = 200,nullable = false)
    private String letter;

    public AlphabetModel(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }


    public AlphabetModel(String letter){
        this.letter = letter;
    }

}
