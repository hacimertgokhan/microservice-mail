package github.hacimertgokhan.mgmailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "github.hacimertgokhan.mgmailservice.repository")
@EnableWebMvc
public class MgMailServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MgMailServiceApplication.class, args);
    }

}
