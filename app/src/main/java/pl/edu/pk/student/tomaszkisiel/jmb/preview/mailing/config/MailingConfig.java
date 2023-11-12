package pl.edu.pk.student.tomaszkisiel.jmb.preview.mailing.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.pk.student.tomaszkisiel.jmb.JmbClient;
import pl.edu.pk.student.tomaszkisiel.jmb.transporters.Topic;

import java.io.IOException;

@Configuration
public class MailingConfig {
    private final Logger logger = LoggerFactory.getLogger(MailingConfig.class);

    @Bean
    public JmbClient jmbClient() throws IOException {
        JmbClient client = new JmbClient("localhost", 3000);

        client.consume((Topic<?> topic) -> {
            if (topic.getTopic().equals("user.created")) {
                logger.info("Event has been ingested successfully! Confirmation email was sent to the user.");
            }
        });
        client.start();

        return client;
    }
}
