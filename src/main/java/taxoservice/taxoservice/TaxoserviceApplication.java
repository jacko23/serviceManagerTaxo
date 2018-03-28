package taxoservice.taxoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan(basePackages = {"taxoservice.taxoservice.entity" })
@EnableJpaRepositories(basePackages = {"taxoservice.taxoservice.repository"})
public class TaxoserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxoserviceApplication.class, args);
	}
}
