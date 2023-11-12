package pl.edu.pk.student.tomaszkisiel.jmb.preview.users.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.pk.student.tomaszkisiel.jmb.JmbClient;

import java.io.IOException;

@Configuration
public class UsersConfig {
    @Bean
    public JmbClient jmbClient() throws IOException {
        JmbClient client = new JmbClient("localhost", 3000);
        client.start();

        return client;
    }
}
