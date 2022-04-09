package curso.api.model;

public class Persona {
    private int id;
    private String nombre;
    private String apPat;
    
    public Persona() { //Java bean == POJO == DTO == VO
    }
    
    public Persona(int id, String nombre, String apPat) {
        this.id = id;
        this.nombre = nombre;
        this.apPat = apPat;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApPat() {
        return apPat;
    }
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }
    
    
}
