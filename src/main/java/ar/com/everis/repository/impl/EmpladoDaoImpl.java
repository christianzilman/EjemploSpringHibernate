package ar.com.everis.repository.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.com.everis.domain.Empleado;
import ar.com.everis.repository.EmpleadoDao;

@Repository
public class EmpladoDaoImpl implements EmpleadoDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void insert(Empleado empleado) {
		sessionFactory.getCurrentSession().save(empleado);
	}

	public void update(Empleado empleado) {
		sessionFactory.getCurrentSession().update(empleado);
	}

	public void delete(Empleado empleado) {
		sessionFactory.getCurrentSession().delete(empleado);
	}

	@SuppressWarnings("unchecked")
	public List<Empleado> listAll() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria =session.createCriteria(Empleado.class);
		return criteria.list();				
	}

	public Empleado findById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();		
		Criteria criteria =session.createCriteria(Empleado.class);
		criteria.add(Restrictions.eq("idEmpleado", id));
		return (Empleado) criteria.uniqueResult();	
	}

}
