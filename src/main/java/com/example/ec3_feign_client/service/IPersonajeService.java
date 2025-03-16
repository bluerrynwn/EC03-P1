package com.example.ec3_feign_client.service;

import com.example.ec3_feign_client.client.placeholder.idibujoservice.Personaje;

import java.util.List;

public interface IPersonajeService {
    List<Personaje> obtenerPersonajeClient();
    Personaje obtenerPersonajeXid(Long id);

}
