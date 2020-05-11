package com.goowia.apprest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "persona")
public class personaService {
    @Id
    private Integer idPer;
    @Column(name = "nombres",length = 50,nullable = false)
    private String nombres;
    @Column(name = "apellidos",length = 50,nullable = false)
    private String apellidos;
    @Column(name = "email",length = 100)
    private String email;
    @Column(name = "fecnac")
    private Date fecnac;


    public void setIdPer(Integer idPer) {
        this.idPer = idPer;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFecnac(Date fecnac) {
        this.fecnac = fecnac;
    }

    public Integer getIdPer() {
        return idPer;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public Date getFecnac() {
        return fecnac;
    }
}
