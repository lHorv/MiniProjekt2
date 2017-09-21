package nfg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nfg.controller.IzdelekController;
import nfg.model.Izdelek;

public class IzdelekControllerTest {
	
	@Test
	public void testIzdelekGet() {
		IzdelekController ic = new IzdelekController();
		Izdelek izdelek = ic.get(1L);
		assertEquals(1L, izdelek.getId());
	}
}
