package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.CitasDto;
import dtos.PacienteDto;

public class MenuImplementacion implements  MenuInterfaz {

	
	
	public int MostrarMenuPrincipal(Scanner sc) {
		
		int seleccionUsuario;
		
		System.out.println("#############################");
		System.out.println("0. Cerrar la aplicacion");
		System.out.println("1. Registro de empleado");
		System.out.println("2. Registro de paciente");
		System.out.println("elija una opcion valida");
		
		seleccionUsuario = sc.nextInt();
		
		return seleccionUsuario;
	}

	@Override
	public void accederVersionEmpleado() {

		EmpleadoInterfaz ei = new EmpleadoImplementacion();

        int opcionEmpleado;
        opcionEmpleado = mostrarMenuEmpleadoYSeleccion();

        List<PacienteDto> listaPaciente = new ArrayList<PacienteDto>();
        List<CitasDto> listaCitas = new ArrayList<CitasDto>();
        switch (opcionEmpleado)
        {
            case 0:
                break;
            case 1:
                ei.validarNuevoPaciente(listaPaciente);
                break;
            case 2:
                ei.ImprimirCitasMedicas(listaCitas); 
                break;
                
                default:
                System.out.println("No eligio opcion correcta");
                break;
        }
	}

	/*creacion del metodo para acceder a al version paciente*/
	@Override
	public void accederVersionPaciente() {
		
		PacienteInterfaz pi = new PacienteImplementacion();

        int opcionPaciente;
        opcionPaciente = mostrarMenuPacienteYSeleccion();

        List<PacienteDto> listaPaciente = new ArrayList<PacienteDto>();
        switch (opcionPaciente)
        {
            case 0:
                break;
            case 1:
                pi.RegistroCliente(listaPaciente);
                break;
            case 2:
                pi.SolicitudCitasMedicas(listaPaciente); 
                break;
                
                default:
                System.out.println("No eligio opcion correcta");
                break;
        }
		
	}

	/*implementacion de los metodos*/
	@Override
	public int mostrarMenuEmpleadoYSeleccion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mostrarMenuPacienteYSeleccion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

	

}
