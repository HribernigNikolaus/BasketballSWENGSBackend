package at.fh.ima.swengs.bbleague.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//TODO: rename to SecurityConfiguration to activate spring basic authentication
//create users as started in line 25

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration_template extends WebSecurityConfigurerAdapter {

    /**
     * This section defines the user accounts which can be used for
     * authentication as well as the roles each user has.
     */
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user").password("user").roles("USER").and()
                .withUser("admin").password("admin").roles("USER", "ADMIN");
    }

    /**
     * This section defines the security policy for the app.
     * - BASIC authentication is supported (enough for this REST-based demo)
     * - /employees is secured using URL security shown below
     * - CSRF headers are disabled since we are only testing the REST interface,
     *   not a web one.
     *
     * NOTE: GET is not shown which defaults to permitted.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .httpBasic().and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/players").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/players/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/players/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/leagues").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/leagues/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/leagues/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/stadiums").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/stadiums/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/stadiums/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/teams").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/teams/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/teams/**").hasRole("ADMIN")
                .and()
                .csrf().disable();
    }
}