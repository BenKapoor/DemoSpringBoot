package eu.ensup.demospringboot;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
public class DemospringbootApplication {
	
	public static void main(String[] args) {
//		SpringApplication.run(DemospringbootApplication.class, args);
		SpringApplication app = new SpringApplication(DemospringbootApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.servlet.context-path", "/demospring"));
		app.run(args);
	}

}
