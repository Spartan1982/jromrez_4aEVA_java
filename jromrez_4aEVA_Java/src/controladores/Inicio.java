package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {

		
		
		int seleccionUsuario;
		boolean cerrarMenu = false;
		Scanner sc = new Scanner(System.in);
		List<Integer>ListaPaciente = new ArrayList();
		MenuInterfaz mi = new MenuImplementacion();
		
		/*creacion del menu*/
		
		try {
		while(!cerrarMenu) {
			
			seleccionUsuario = mi.MostrarMenuPrincipal(sc);
			
			switch(seleccionUsuario) {
			
			case 0: System.out.println("Salir del menu");
			break;
			
			case 1: System.out.println("EMPLEADO");
			mi.accederVersionEmpleado();
			break;
			
			case 2: System.out.println("PACIENTE");
			mi.accederVersionPaciente();
			break;
			
			default:
				break;
			}
			
			} catch(IOException e) {
				
				
	            e.printStackTrace();
			}
		
		}
	}
}