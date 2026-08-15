package com.janGr.myAwesomeApp;

import com.janGr.myAwesomeApp.model.User;
import com.janGr.myAwesomeApp.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Load {

    private static final Logger log = LoggerFactory.getLogger(Load.class);

    @Bean
        CommandLineRunner initDatabase(UserRepository userRepository) {

        return args -> {
            log.info("Preloading " + userRepository.save(new User("Bilbo", "Baggins", "Bilbo@mail.com","burglar")));
            log.info("Preloading " + userRepository.save(new User("Frodo", "Baggins", "Frodo@mail.com","thief")));
        };
    }
}