package javaee.jenkins;
import javaee.jenkins.Ajaja.Ajotapa;
import junit.framework.TestCase;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;


public class AjajaTesti extends TestCase {
	
	@Mock
	Auto mockAuto;

	
	@Before
	public void setUp() {
		when(mockAuto.laskeNopeus()).thenReturn(100.0);
		
	}
	

	@Test
	public void testAja() {
		Ajaja testiAjaja = new Ajaja (mockAuto, "Teuvo", Ajotapa.TAVALLINEN );
		
		double testiArvo;	
		
		System.out.println(testiAjaja.toString());
		
		testiArvo = testiAjaja.aja(5);
		
		assertEquals(350.0, testiArvo, 0.001);
		
	}
	
	@Test
	public void testAja2() {
		Ajaja testiAjaja = new Ajaja (mockAuto, "Tauno", Ajotapa.AGGRESSIIVINEN );
		
		double testiArvo;
		
		testiArvo = testiAjaja.aja(10);
		
		assertEquals(1000.0, testiArvo, 0.001);
		
		
	}


}
