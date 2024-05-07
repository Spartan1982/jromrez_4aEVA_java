package servicios;

import java.util.Scanner;

public interface MenuInterfaz {

	public int MostrarMenuPrincipal(Scanner sc);

	public void accederVersionEmpleado();

	public void accederVersionPaciente(); 
	
	public int mostrarMenuEmpleadoYSeleccion();
	
	public int mostrarMenuPacienteYSeleccion();
	
	
}
