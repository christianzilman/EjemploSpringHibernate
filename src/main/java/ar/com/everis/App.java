package ar.com.everis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.everis.domain.Persona;
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
	        } catch (Exception ex) {
	        	ex.printStackTrace();
	        }
	}

}
