package curso.api.mappers;

import java.util.HashSet;
import java.util.Set;

import curso.api.model.Persona;

public class PersonaMapper {
    private static PersonaMapper instance;
    
    public static PersonaMapper getInstance() {
        if(instance!=null)
            return instance;
        return new PersonaMapper();
    }
    
    private PersonaMapper() {}
    
    
    
    
    // ***************************************************
    private Set<Persona> bolsa = new HashSet<>();
    
    public Persona find(int id) {
        return null;
    }
    public void update(Persona p) {
        // todo
    }
    public void insert(Persona p) {
        // todo
    }
    public void delete(int id) {
        // todo
    }
}
