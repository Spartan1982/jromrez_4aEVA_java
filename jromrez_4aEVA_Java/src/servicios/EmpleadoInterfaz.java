package servicios;

import java.util.List;

import dtos.CitasDto;
import dtos.PacienteDto;

public interface EmpleadoInterfaz {

	public void accederVersionEmpleado(List<PacienteDto> listaPaciente);

	
	public void ImprimirCitasMedicas(List<CitasDto> listaCitas);

	void validarNuevoPaciente(List<PacienteDto> listaPaciente);
}
