package servicios;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import dtos.PacienteDto;

public class PacienteImplementacion implements PacienteInterfaz {

	public static void main(String[] args) {

	}

	
	
	/*creacion del metodo para acceder registro cliente*/
	Scanner sc = new Scanner(System.in);
	@Override
	public void RegistroCliente(List<PacienteDto> listaPaciente) {
		System.out.println("Ingrese el DNI");
		String dniPaciente=sc.next();
		
		System.out.println("Ingrese el nombre");
		String nombrePaciente=sc.next();
		
		System.out.println("Ingrese los apellidos");
		String apellido1Paciente,apellido2Paciente=sc.next();
		
		System.out.println("Ingrese una fecha");
		LocalDateTime Fecha = LocalDateTime.now();
		
		PacienteDto nuevoPaciente= new PacienteDto(idPaciente, nombrePaciente,apellido1Paciente,apellido2Paciente);
		
	}

	/*creacion del metodo para acceder a solicitud medica*/
	@Override
	public void SolicitudCitasMedicas(List<PacienteDto> listaPaciente) {

		System.out.println("Introduzca su dni");
		String dniPaciente=sc.next();
		boolean esValidado;
		if(esValidado=true) {
			
		}else {System.out.println("su dni no existe");}
		
		
	}

	/*implementacion de los metodos*/
	@Override
	public void validarNuevoCliente(List<PacienteDto> listaPaciente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ImprimirCitasMedicas(List<PacienteDto> listaPaciente) {
		// TODO Auto-generated method stub
		
	}

}
