package curso.api.service;

import curso.api.model.Persona;

public interface PersonaService {
    Persona getPersona(int id);
    int convierte(String token);
}