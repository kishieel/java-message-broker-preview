package pl.edu.pk.student.tomaszkisiel.jmb.preview.shared;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public record UserCreatedEvent(UUID uuid, String firstName, String lastName, String email) implements Serializable {
    @Serial
    private static final long serialVersionUID = 10000L;
}