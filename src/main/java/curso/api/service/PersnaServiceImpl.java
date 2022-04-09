package curso.api.service;

import org.springframework.stereotype.Service;

import curso.api.mappers.PersonaMapper;
import curso.api.model.Persona;

@Service
public class PersnaServiceImpl implements PersonaService {
    private PersonaMapper pm = PersonaMapper.getInstance();

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

    @Override
    public Persona update(Persona p) {
        Persona obj = pm.find(p.getId());
        Persona fromDataBase = new Persona(4, "adolfo", "sandoval");
        // encuentra en la base de dfatos el objeto persona
        // y una vez encontrado, actualizalo con los datos 
        // que estás recibiendo
        fromDataBase.setApPat(p.getApPat());
        fromDataBase.setNombre(p.getNombre());
        return fromDataBase;
    }

}
