package com.rest.webservices.jpaexample;

import com.rest.webservices.jpaexample.entity.User;
import com.rest.webservices.jpaexample.service.UserDAOService;
import com.rest.webservices.jpaexample.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Sunder","Admin");
        userRepository.save(user);
        log.info("New user created : "+user);
        Optional<User> userIdOne = userRepository.findById(1L);
        log.info("User retrieved : "+userIdOne);
        List<User> userList = userRepository.findAll();
        log.info("All users : "+userList);
    }
}
