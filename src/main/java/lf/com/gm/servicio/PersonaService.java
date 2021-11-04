package lf.com.gm.servicio;

import java.util.List;
import lf.com.gm.domain.Persona;

public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}
