package com.spring.demo.model;

import org.springframework.stereotype.Repository;

@Repository
public class ModelPersona implements interfaceModelPers{

    @Override
    public void insertar(String nombre) {

        System.out.println("nombre insertado " + nombre);
    }
}