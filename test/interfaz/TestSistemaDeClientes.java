package interfaz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.ClienteBandaAncha;
import dominio.ClienteCable;
import dominio.ClienteTelefonia;

public class TestSistemaDeClientes {

	@Test
	public void queSePuedaCrearUnClienteDeTelefonia() {
		ClienteTelefonia nuevo = new ClienteTelefonia(1000, "Juana", "11", "63598237");
		System.out.println(nuevo.getCodigoDeArea());
		System.out.println(nuevo.getTelefono());
		assertEquals(nuevo.getCodigoDeArea(), "11");
		assertEquals(nuevo.getTelefono(), "63598237");
	}

	@Test
	public void queSePuedaCrearUnClienteDeCable() {
		ClienteCable nuevo = new ClienteCable(1000, "Pepe", "46546546504637");
		assertEquals(nuevo.getCodigoDecodificador(), "46546546504637");
	}

	@Test
	public void queSePuedaCrearUnClienteDeBandaAncha() {
		ClienteBandaAncha nuevo = new ClienteBandaAncha(1000, "Susana", "susi@telecomunications.com");
		assertEquals(nuevo.getEMail(), "susi@telecomunications.com");

	}
// hasta aca da verde
	// aumentar complejidad?
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
