package ar.com.everis.repository.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.com.everis.domain.Persona;
import ar.com.everis.repository.PersonaDao;
/**
 * 
 * @author chzilman	18/07/2013
 *
 */
@Repository
public class PersonaDaoImpl implements PersonaDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(persona);
	}

	@SuppressWarnings("unchecked")
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Persona.class);		
		return criteria.list();
	}

}
