package ejercicio;

public class SumarTabla {

	
	private int[] tabla;

	public SumarTabla (int[] tabla) {
		if (tabla == null || tabla.length == 0)
			throw new IllegalArgumentException("No hay elementos");
		this.tabla = tabla;
	}

	public int sumar() {
		int suma = 0;
		int n = tabla.length;
		for (int i = 0; i < n; i++)
			suma = suma + tabla[i];
		return suma;
	}// sumar tabla
	
	
}// fin clase

