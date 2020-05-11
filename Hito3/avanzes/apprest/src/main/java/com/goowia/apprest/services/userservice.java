package com.goowia.apprest.services;
import org.springframework.stereotype.Service;

@Service
public class  userservice implements userserviceinterface{
    @Override
    public String getName(String name) {
        return "Mi primer Servicio REST by: " + name;
    }
}
