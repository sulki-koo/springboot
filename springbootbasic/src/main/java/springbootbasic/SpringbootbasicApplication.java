package springbootbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootbasicApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootbasicWebApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
		System.out.println("Hello Spring Boot!");
	}

}
