/**
 * 
 */
package ar.com.everis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.everis.domain.Empleado;
import ar.com.everis.repository.EmpleadoDao;
import ar.com.everis.service.EmpleadoService;

/**
 * @author chzilman
 * 
 */
@Service("empleadoService")
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao empleadoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.everis.service.EmpleadoService#insert(ar.com.everis.domain.Empleado
	 * )
	 */
	public void insert(Empleado empleado) {
		// TODO Auto-generated method stub
		try {
			empleadoDao.insert(empleado);
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.everis.service.EmpleadoService#update(ar.com.everis.domain.Empleado
	 * )
	 */
	public void update(Empleado empleado) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.everis.service.EmpleadoService#delete(ar.com.everis.domain.Empleado
	 * )
	 */
	public void delete(Empleado empleado) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.everis.service.EmpleadoService#listAll()
	 */
	public List<Empleado> listAll() {
		// TODO Auto-generated method stub
		try{
			return empleadoDao.listAll();
		}catch(RuntimeException ex){
			ex.printStackTrace();
			throw ex;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.everis.service.EmpleadoService#findById(int)
	 */
	@Transactional(readOnly = true)
	public Empleado findById(int id) {
		// TODO Auto-generated method stub
		try {
			return empleadoDao.findById(id);
		} catch (RuntimeException ex) {
			ex.printStackTrace();
			throw ex;
		}
	}
}
