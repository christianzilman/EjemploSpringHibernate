package ar.com.everis.service;
import java.util.List;
import ar.com.everis.domain.*;

/**
 * 
 * @author chzilman	18/07/2013
 *
 */
public interface PersonaService {
	public void guardar(Persona persona);
	public List<Persona> listar(); 
}
