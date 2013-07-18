package ar.com.everis.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author chzilman	18/07/2013
 *
 */
@Entity
@Table(name="persona")
public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idpersona")
	private int id;
	@Column(name="nombre")
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
