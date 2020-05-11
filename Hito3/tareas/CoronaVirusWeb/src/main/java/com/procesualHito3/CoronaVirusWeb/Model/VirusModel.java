package com.procesualHito3.CoronaVirusWeb.Model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Virus")
public class VirusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idcoronavirus;
    @Column(name = "nombresDepartamento", length = 50, nullable = false)
    private String nombresDepa;
    @Column(name = "CasosContagiados")
    private int casosContag;
    @Column(name = "CasosSostepochosos")
    private int casosSospechosos;
    @Column(name = "CasosRecuperados")
    private int casosRecuperados;

    public int getIdcoronavirus() {
        return idcoronavirus;
    }

    public void setIdDepar(int idcoronavirus) {
        this.idcoronavirus = idcoronavirus;
    }

    public String getNombresDepa() {
        return nombresDepa;
    }

    public void setNombresDepa(String nombresDepa) {
        this.nombresDepa = nombresDepa;
    }

    public int getCasosContag() {
        return casosContag;
    }

    public void setCasosContag(int casosContag) {
        this.casosContag = casosContag;
    }

    public int getCasosSospechosos() {
        return casosSospechosos;
    }

    public void setCasosSospechosos(int casosSospechosos) {
        this.casosSospechosos = casosSospechosos;
    }

    public int getCasosRecuperados() {
        return casosRecuperados;
    }

    public void setCasosRecuperados(int casosRecuperados) {
        this.casosRecuperados = casosRecuperados;
    }
}
