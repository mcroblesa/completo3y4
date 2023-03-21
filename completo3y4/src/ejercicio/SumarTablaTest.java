/**
 * 
 */
package ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * @author Usuario
 *
 */
class SumarTablaTest {
	private int[] tabla;
	private SumarTabla sumarTabla;

	@BeforeEach
	public void creaTabla() {
		tabla =  new int[] {10, 20, 30, 40};
		sumarTabla=new SumarTabla(tabla);
	}

	@Test
	void sumarTest() {
		int valorEsperado = 100;
		int resultado = sumarTabla.sumar();
		assertEquals(valorEsperado, resultado, 0);
	}
	
	@Test
	void tablaTest() {	
		int[] tablaV = new int[] {};
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {new SumarTabla(tablaV);});  
	}

}
