package at.fh.ima.swengs.bbleague;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
//@EnableAuthorizationServer TODO: Oauth2
//@EnableResourceServer TODO: Oauth2
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class BbleagueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbleagueApplication.class, args);
	}
}
