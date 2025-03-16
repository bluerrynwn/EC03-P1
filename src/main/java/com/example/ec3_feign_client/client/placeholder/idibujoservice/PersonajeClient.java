package com.example.ec3_feign_client.client.placeholder.idibujoservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "personajeClient", url = "https://rickandmortyapi.com/api/character")

public interface PersonajeClient {
    @GetMapping
    Map<String, Object> obtenerPersonajes();

    @GetMapping("/{id}")
    Personaje obtenerPersonajeXid(@PathVariable("id") Long id);

}
