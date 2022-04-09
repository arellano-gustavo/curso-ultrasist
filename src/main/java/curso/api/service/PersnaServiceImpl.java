package curso.api.service;

import org.springframework.stereotype.Service;

import curso.api.model.Persona;

@Service
public class PersnaServiceImpl implements PersonaService {

    @Override
    public Persona getPersona(int id) {
        return new Persona(id, "a","b");
    }

    @Override
    public int convierte(String token) {
        try {
            return Integer.parseInt(token);
        } catch (Exception e) {
            return 0;
        }
    }

}
