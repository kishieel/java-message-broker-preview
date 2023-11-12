/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pl.edu.pk.student.tomaszkisiel.jmb.preview.mailing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MailingMicroservice {

    public static void main(String[] args) {
        SpringApplication.run(MailingMicroservice.class, args);
    }
}
