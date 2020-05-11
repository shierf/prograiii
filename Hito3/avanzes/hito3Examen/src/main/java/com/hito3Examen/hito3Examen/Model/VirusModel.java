package com.hito3Examen.hito3Examen.Model;
import javax.persistence.*;
@Entity
@Table(name = "corona_virus_paciente")
public class VirusModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCoronavirus;
    @Column(name = "nombresDepartamento", length = 50, nullable = false)
    private String nombresDepa;
    @Column(name = "nombresPaciente", length = 50, nullable = false)
    private String nombrePaciente;
    @Column(name = "apellidosPaciente", length = 50, nullable = false)
    private String apellidosPaciente;
    @Column(name = "edadPaciente")
    private int edadPaciente;
    @Column(name = "Categoria", length = 50, nullable = false)
    private String categoria;
    @Column(name = "fullname", length = 100, nullable = false)
    private String fullname;
    @Column(name = "CasosContagiados")
    private int casosContag;
    @Column(name = "CasosSostepochosos")
    private int casosSospechosos;
    @Column(name = "CasosRecuperados")
    private int casosRecuperados;

    public String getApellidosPaciente() {
        return apellidosPaciente;
    }

    public void setApellidosPaciente(String apellidosPaciente) {
        this.apellidosPaciente = apellidosPaciente;
    }
    public int getIdCoronavirus() {
        return idCoronavirus;
    }

    public void setIdCoronavirus(int idCoronavirus) {
        this.idCoronavirus = idCoronavirus;
    }

    public String getNombresDepa() {
        return nombresDepa;
    }

    public void setNombresDepa(String nombresDepa) {
        this.nombresDepa = nombresDepa;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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
