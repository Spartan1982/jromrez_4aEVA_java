package servicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.CitasDto;
import dtos.PacienteDto;

public class EmpleadoImplementacion implements EmpleadoInterfaz {

	

		
/*creacion del metodo para acceder a al version empleado*/
	@Override
	public void accederVersionEmpleado(List<PacienteDto> listaPaciente) {
		// TODO Auto-generated method stub
		
	}

	Scanner sc = new Scanner(System.in);
	@Override
	public void validarNuevoPaciente(List<PacienteDto> listaPaciente) {
		System.out.println("Elija un cliente por su DNI");
		String dniCliente= sc.next();
		
		
		PacienteDto nuevoPaciente = new PacienteDto(idPaciente);
		listaPaciente.add(nuevoPaciente);
		
		
	}

	/*creacion del metodo para citas medicas*/
	@Override
	public void ImprimirCitasMedicas(List<CitasDto> listaCitas) {

		System.out.println("Ingrese la fecha a consultar (formato dd-MM-yyyy)");
		String fechaConsultada = sc.next();
		
		
		List<CitasDto> fechaCita1 = new ArrayList<CitasDto>();
		List<PacienteDto> Paciente = new ArrayList<PacienteDto>();
		
		String fichero = "informe-ddMMyyyy.txt";
		
		LocalDate fechaCita = LocalDate.now();
		
		String diasFecha = DateTimeFormatter.ofPattern("dd").format(fechaCita);

        String mesFecha = DateTimeFormatter.ofPattern("MM").format(fechaCita);

        String anioFecha = DateTimeFormatter.ofPattern("yy").format(fechaCita);

        return; 
		
		
		
		
		
		
	
	
	}
}
