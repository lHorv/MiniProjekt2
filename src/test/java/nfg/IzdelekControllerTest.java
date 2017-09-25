package nfg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import nfg.controller.IzdelekController;
import nfg.model.Izdelek;
import nfg.repository.InMemoryProductRepository;

public class IzdelekControllerTest {
	
	@InjectMocks
	private IzdelekController ic;
	
	@Mock
	private InMemoryProductRepository productRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void IzdelekGetTest() {
		Izdelek i = new Izdelek();
		i.setId(1L);
		//ko se klice metoda get, mora vrniti stubbed objekt 
		when(productRepository.get(1L)).thenReturn(i);
		
		Izdelek izdelek = ic.get(1L);
		
		//ce je bila metoda klicana 1x
		verify(productRepository).get(1L);
		
		assertEquals(1L, izdelek.getId().longValue());
	}
	
	@Test
	@Ignore
	public void IzdelektAddTest() {
		Izdelek i = new Izdelek();
		when(productRepository.add(i)).thenReturn(i);
		
		ic.create(i);
		Izdelek izdelek = ic.get(3L);
		
		verify(productRepository).add(i);
		verify(productRepository).get(3L);
		
		assertNotNull(izdelek.getId().longValue());
	}
}
