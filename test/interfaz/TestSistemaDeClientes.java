package interfaz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.ClienteTelefonia;

public class TestSistemaDeClientes {

	@Test
	public void queSePuedaCrearUnClienteDeTelefonia() {
		// por ahora esto da verde
		ClienteTelefonia nuevo = new ClienteTelefonia(1000, "Juana", "11", "63598237");
		System.out.println(nuevo.getCodigoDeArea());
		System.out.println(nuevo.getTelefono());
		assertEquals(nuevo.getCodigoDeArea(), "11");
		assertEquals(nuevo.getTelefono(), "63598237");
	}

	@Test
	public void queSePuedaCrearUnClienteDeCable() {

	}

	@Test
	public void queSePuedaCrearUnClienteDeBandaAncha() {

	}

	@Test
	public void queSePuedaCrearUnClienteTri() {

	}

	@Test
	public void queSePuedanIncorporarDistintosClientes() {

	}

	@Test
	public void queUnClienteDeCablePuedaHabilitarElCodificado() {

	}

	
}
