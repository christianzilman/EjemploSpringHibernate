/**
 * 
 */
package ar.com.everis.service;

import java.util.List;

import ar.com.everis.domain.Empleado;

/**
 * @author chzilman
 *
 */
public interface EmpleadoService {	
	public void insert(Empleado empleado);
	public void update(Empleado empleado);
	public void delete(Empleado empleado);
	public List<Empleado> listAll();
	public Empleado findById(int id);
}
