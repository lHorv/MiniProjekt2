package nfg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("nfg.repository.IzdelekRepository")
public class MiniSpringProjektApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniSpringProjektApplication.class, args);
	}
}
