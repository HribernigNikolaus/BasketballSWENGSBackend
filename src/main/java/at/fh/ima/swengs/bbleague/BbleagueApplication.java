package at.fh.ima.swengs.bbleague;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

public class BbleagueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbleagueApplication.class, args);
	}
}
