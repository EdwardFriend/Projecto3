/**
 * 
 */
package clases;

/**
 * @author MARIO LUZARDO
 *
 */
public abstract class Persona {
	protected String nombres;
	protected String apellidos;
	protected String cedula;
	public Persona() {}
	public Persona(String nombres, String apellidos, String cedula) {
		this.nombres=nombres;
		this.apellidos=apellidos;
		this.cedula=cedula;
	}
}
