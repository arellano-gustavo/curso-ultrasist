package curso.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import curso.api.model.Persona;
import curso.api.service.PersonaService;

@RestController
@RequestMapping(value = "/api")
public class PrimeroController {
    private PersonaService ps;
    
    public PrimeroController(PersonaService ps) {
        this.ps = ps;
    }
    
    @GetMapping(
            path = "/saluda",
            produces = "application/json; charset=utf-8")
    public Persona getSaludo(@RequestParam String token) throws Exception {
        int id = ps.convierte(token);
        return ps.getPersona(id);
    }
    
    @PutMapping(
            path = "/saluda",
            produces = "application/json; charset=utf-8")
    public Persona actualiza(@RequestBody Persona p) throws Exception {
        return ps.update(p);
    }
    
}
