package com.goowia.apprest.services;

import com.goowia.apprest.model.personaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
public class persona implements PersonaServiceInterface {

    private personaService personaModel;
    private Integer idPer;
    private String nombre;
    private String apellidos;
    private String email;
    private Date fecnac;

    @Override
    public persona save(persona persona) {
        personaModel = new personaService();
        personaModel.setIdPer(persona.getIdPer());
        personaModel.setNombres(persona.getNombre());
        personaModel.setApellidos(persona.getApellidos());
        personaModel.setEmail(persona.getEmail());
        personaModel.setFecnac(persona.getFecnac());
        System.out.printf("persona service");
        return null;
    }

    @Override
    public persona update(persona persona) {
        return null;
    }

    @Override
    public Integer delete(Integer idPer) {
        return null;
    }

    public Integer getIdPer() {
        return idPer;
    }

    public String getNombre() {
        return nombre;
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
