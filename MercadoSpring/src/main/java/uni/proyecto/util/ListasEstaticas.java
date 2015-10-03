package uni.proyecto.util;

public class ListasEstaticas {
	
	public enum TIPODOCUMENTO{
		
		DNI(1), RUC(2);
		private Integer value;
		
		private TIPODOCUMENTO(Integer value) {
			this.value = value;
		}
		
		public Integer getValue() {
			return value;
		}
		
	}
	
	public enum GENERO{
		
		HOMBRE(1), MUJER(2);
		private Integer value;
		
		private GENERO(Integer value) {
			this.value = value;
		}
		
		public Integer getValue() {
			return value;
		}
		
	}
	
	public enum ESTADOCIVIL{
		
		SOLTERO(1), CASADO(2), VIUDO(3), DIVORCIADO(4);
		private Integer value;
		
		private ESTADOCIVIL(Integer value) {
			this.value = value;
		}
		
		public Integer getValue() {
			return value;
		}
		
	}

}
