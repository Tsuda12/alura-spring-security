package med.voll.web_application.infra.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService usersData() {
        UserDetails user1 = User.builder()
                .username("felipe.tsuda@gmail.com")
                .password("admin")
                .build();

        UserDetails user2 = User.builder()
                .username("isabela.rocha@gmail.com")
                .password("admin")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);
    }
}
