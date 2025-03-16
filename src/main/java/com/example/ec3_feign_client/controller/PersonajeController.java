package com.example.ec3_feign_client.controller;

import com.example.ec3_feign_client.client.placeholder.idibujoservice.Personaje;
import com.example.ec3_feign_client.service.IPersonajeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1/personajes")
public class PersonajeController {
    private final IPersonajeService iPersonajeService;

    public PersonajeController(IPersonajeService iPersonajeService){
        this.iPersonajeService=iPersonajeService;
    }

    @GetMapping
    public List<Personaje> getPersonaje(){
        return iPersonajeService.obtenerPersonajeClient();
    }

    @GetMapping("/{id}")
    public Personaje getPersonajeById(@PathVariable Long id){
        return iPersonajeService.obtenerPersonajeXid(id);
    }




}
