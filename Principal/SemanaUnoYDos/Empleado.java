package Principal.SemanaUnoYDos;

public class Empleado {
	
		private int id;
		private String nombre;
		private String apellido;
		private int edad;
		private String direccion;
		private String sexo; 
		private String estado; 
		
		
		public Empleado(int id, String nombre, String apellido, int edad, String direccion, String sexo, String estado) {
			this.id = id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.direccion = direccion;
			this.sexo = sexo;
			this.estado = estado;
		}

		public Empleado() {
		}

		@Override
		public String toString() {
			return "el nombre es: " + nombre;
		}	

}
