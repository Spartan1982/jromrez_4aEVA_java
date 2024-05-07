package servicios;

import java.util.List;

import dtos.PacienteDto;

public interface PacienteInterfaz {

	void validarNuevoCliente(List<PacienteDto> listaPaciente);

	void ImprimirCitasMedicas(List<PacienteDto> listaPaciente);

	void RegistroCliente(List<PacienteDto> listaPaciente);

	void SolicitudCitasMedicas(List<PacienteDto> listaPaciente);

}
