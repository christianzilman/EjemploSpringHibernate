package ar.com.everis.repository;

import java.util.List;

import ar.com.everis.domain.Persona;
/**
 * 
 * @author chzilman	18/07/2013
 *
 */
public interface PersonaDao {	
	public void guardar(Persona persona);	
	public List<Persona> listar();
}
