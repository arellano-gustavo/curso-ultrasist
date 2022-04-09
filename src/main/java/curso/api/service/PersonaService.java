package curso.api.service;

import curso.api.model.Persona;

public interface PersonaService {
    Persona update(Persona p);
    Persona getPersona(int id);
    int convierte(String token);
}