package com.goowia.apprest.controller;

import com.goowia.apprest.services.persona;
import com.goowia.apprest.services.personaService;
import com.goowia.apprest.services.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/")
public class usercontrollerrest {
    @Autowired
    private userservice userService;
    private final String NANE_APP ="nicolas loco";

    @GetMapping("/naneApp")
public String naneApp(){
    return "nicolas loco";
}
    @GetMapping("/saludo")
    public String saludo(@RequestParam(value = "name", defaultValue = "World")String name){
        return  userService.getName(name);
}
public ResponseBody save1(@RequestBody personaService persona){
        try{
            return new ResponseEntity<>(persona)
        }catch (Exception e){

        }

}
    @PostMapping("/persona")
    public String save(@RequestBody persona persona) {
        persona.save(persona);
        return"persona insertado correctamente";
    }
}
