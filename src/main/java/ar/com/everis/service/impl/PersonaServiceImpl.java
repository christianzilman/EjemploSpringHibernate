package ar.com.everis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import ar.com.everis.domain.Persona;
import ar.com.everis.repository.PersonaDao;
import ar.com.everis.service.PersonaService;
/**
 * 
 * @author chzilman	18/07/2013
 *
 */
@Service("personaService")
@Transactional
public class PersonaServiceImpl implements PersonaService {
	@Autowired
	private PersonaDao personaDao;	
	
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		try{			
			personaDao.guardar(persona);
			//personaDao.guardar(null);
		}
		catch(RuntimeException ex){
			ex.printStackTrace();
			throw ex; 
		}
	}

	@Transactional(readOnly=true)
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		try{
			return personaDao.listar();
		}catch(RuntimeException ex){
			ex.printStackTrace();
			throw ex;
		}
	}

}
