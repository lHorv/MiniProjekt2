package nfg;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import nfg.controller.Controller;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MiniSpringProjektApplicationTest {

	@Test
	@Ignore
	public void testApp() {
		Controller c = new Controller();
		String result = c.home();
		assertEquals(result, "Spring Boot Application");
	}

}
