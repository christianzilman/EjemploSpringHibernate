package ar.com.everis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.everis.domain.Empleado;
import ar.com.everis.domain.Persona;
import ar.com.everis.service.EmpleadoService;
import ar.com.everis.service.PersonaService;

/**
 * 
 * @author chzilman	18/07/2013
 *
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	           ApplicationContext appContext = new ClassPathXmlApplicationContext("contexto/spring.xml");
	           PersonaService personaService = (PersonaService) appContext.getBean("personaService");
	           for(Persona persona: personaService.listar()){
	        	   System.out.println(persona.getNombre());
	           }
	           
	           EmpleadoService empleadoService = (EmpleadoService) appContext.getBean("empleadoService");
	           
	           
		          /* Empleado empleado = new Empleado();
		           empleado.setNombre("Joaquin");
		           empleado.setTelefono("566223");
		           
		           empleado.setIdCargo(new Cargo(1));
		           empleado.setIdDepartamento(new Departamento(1));*/	           
		          // empleadoService.insert(empleado);
		           
		           
		           for(Empleado emp: empleadoService.listAll()){
		        	   System.out.println(emp.getNombre());
		           }
	        } catch (Exception ex) {
	        	ex.printStackTrace();
	        }
	}

}
