package github.hacimertgokhan.mgmailservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "github.hacimertgokhan.mgmailservice.repository.mongo")
public class MongoConfig {
}
