package dtos;

public class CitasDto {

	

		/*creacion de los atributos de las citas*/
		long idCita;
	    public long getIdCita() {
			return idCita;
		}

		public void setIdCita(long idCita) {
			this.idCita = idCita;
		}

		public String getDniCliente() {
			return dniCliente;
		}

		public void setDniCliente(String dniCliente) {
			this.dniCliente = dniCliente;
		}

		public String getEspecialidad() {
			return especialidad;
		}

		public void setEspecialidad(String especialidad) {
			this.especialidad = especialidad;
		}

		public boolean isEsValidado() {
			return esValidado;
		}

		public void setEsValidado(boolean esValidado) {
			this.esValidado = esValidado;
		}

		String dniCliente = "aaaaa";
	    String especialidad = "aaaaa";
	    
	    boolean esValidado = false;
		public CitasDto(long idCita, String dniCliente, String especialidad, boolean esValidado) {
			super();
			this.idCita = idCita;
			this.dniCliente = dniCliente;
			this.especialidad = especialidad;
			this.esValidado = esValidado;
		}
	    
	    
	}

	
