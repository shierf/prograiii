package com.spring.demo.services;

import com.spring.demo.model.ModelPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicisesPersona implements interfaceServices {
    @Autowired
    private ModelPersona nPersona;
    @Override
    public void insertar(String nombre) {
        nPersona.insertar(nombre);
    }
}
