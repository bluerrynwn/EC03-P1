package com.example.ec3_feign_client.service;

import com.example.ec3_feign_client.client.placeholder.idibujoservice.Personaje;
import com.example.ec3_feign_client.client.placeholder.idibujoservice.PersonajeClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonajeService implements IPersonajeService{
    private final PersonajeClient personajeClient;

    public PersonajeService(PersonajeClient personajeClient){
        this.personajeClient =personajeClient;
    }

    @Override
    public List<Personaje> obtenerPersonajeClient(){
        Map<String, Object> response = personajeClient.obtenerPersonajes();
        ObjectMapper objectMapper = new ObjectMapper(); // Convertidor JSON
        List<Map<String, Object>> results = (List<Map<String, Object>>) response.get("results"); // Extraer la lista

        return results.stream()
                .map(map -> objectMapper.convertValue(map, Personaje.class)) // Convertir cada mapa a Personaje
                .toList();
    }

    @Override
    public  Personaje obtenerPersonajeXid(Long id){
        return personajeClient.obtenerPersonajeXid(id);
    }

}
