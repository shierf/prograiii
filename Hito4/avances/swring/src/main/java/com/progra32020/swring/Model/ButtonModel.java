package com.progra32020.swring.Model;

import javax.persistence.*;

@Entity
@Table (name = "button")
public class ButtonModel {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column (name = "tittle",length = 50,nullable = false)
    private String titleButton;

    public ButtonModel(){

    }
    public ButtonModel(String tittle){
        this.titleButton = tittle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleButton() {
        return titleButton;
    }

    public void setTitleButton(String titleButton) {
        this.titleButton = titleButton;
    }
}
