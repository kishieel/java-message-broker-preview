package pl.edu.pk.student.tomaszkisiel.jmb.preview.users.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pk.student.tomaszkisiel.jmb.JmbClient;
import pl.edu.pk.student.tomaszkisiel.jmb.preview.shared.UserCreatedEvent;
import pl.edu.pk.student.tomaszkisiel.jmb.transporters.Topic;

import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping(value = "/users")
public class UsersController {
    private final Logger logger = LoggerFactory.getLogger(UsersController.class);
    private final JmbClient jmbClient;

    public UsersController(JmbClient jmbClient) {
        this.jmbClient = jmbClient;
    }

    @GetMapping
    public String signUp() throws IOException {
        logger.info("New user has been created! Appropriate topic was published.");
        jmbClient.publish(new Topic<>("user.created", new UserCreatedEvent(UUID.randomUUID(), "Adam", "Nowak", "adam.nowak@example.com")));

        return "OK";
    }
}
