package ar.com.everis.repository;

import java.util.List;

import ar.com.everis.domain.Empleado;

public interface EmpleadoDao {
	public void insert(Empleado empleado);
	public void update(Empleado empleado);
	public void delete(Empleado empleado);
	public List<Empleado> listAll();
	public Empleado findById(int id);
}
