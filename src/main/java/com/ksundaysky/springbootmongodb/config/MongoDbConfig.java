package com.ksundaysky.springbootmongodb.config;

import com.ksundaysky.springbootmongodb.document.User;
import com.ksundaysky.springbootmongodb.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDbConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository) {
        return args -> {
            usersRepository.save(new User(1, "Peter", "Development", 1000L));
            usersRepository.save(new User(2, "Parker", "Learning", 1000L));
            usersRepository.save(new User(3, "Luke", "Development", 1000L));
            usersRepository.save(new User(4, "Grzeniu", "Development", 10000L));
        };
    }
}
