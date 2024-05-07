package dtos;

public class PacienteDto {

	
		/*creacion de los atributos del paciente*/
		long idPaciente;
	    public long getIdPaciente() {
			return idPaciente;
		}






		public void setIdPaciente(long idPaciente) {
			this.idPaciente = idPaciente;
		}






		public String getDniPaciente() {
			return dniPaciente;
		}






		public void setDniPaciente(String dniPaciente) {
			this.dniPaciente = dniPaciente;
		}






		public String getNombrePaciente() {
			return nombrePaciente;
		}






		public void setNombrePaciente(String nombrePaciente) {
			this.nombrePaciente = nombrePaciente;
		}






		public String getApellido1Paciente() {
			return apellido1Paciente;
		}






		public void setApellido1Paciente(String apellido1Paciente) {
			this.apellido1Paciente = apellido1Paciente;
		}






		public String getApellido2Paciente() {
			return apellido2Paciente;
		}






		public void setApellido2Paciente(String apellido2Paciente) {
			this.apellido2Paciente = apellido2Paciente;
		}






		public boolean isEsValidado() {
			return esValidado;
		}






		public void setEsValidado(boolean esValidado) {
			this.esValidado = esValidado;
		}






		String dniPaciente = "aaaaa";
	    String nombrePaciente = "aaaaa";
	    String apellido1Paciente = "aaaaa";
	    String apellido2Paciente = "aaaaa";
	    boolean esValidado = false;
	    
	    
	

	
	
	public PacienteDto(long idPaciente, String dniPaciente, String nombrePaciente, String apellido1Paciente, 
			String apellido2Paciente) { }






		public PacienteDto(long idPaciente, String dniPaciente, String nombrePaciente, String apellido1Paciente,
				String apellido2Paciente, boolean esValidado) {
			super();
			this.idPaciente = idPaciente;
			this.dniPaciente = dniPaciente;
			this.nombrePaciente = nombrePaciente;
			this.apellido1Paciente = apellido1Paciente;
			this.apellido2Paciente = apellido2Paciente;
			this.esValidado = esValidado;
		}
	
	
	
	}
