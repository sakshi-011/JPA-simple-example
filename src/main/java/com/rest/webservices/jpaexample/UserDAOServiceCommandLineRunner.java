package com.rest.webservices.jpaexample;

import com.rest.webservices.jpaexample.entity.User;
import com.rest.webservices.jpaexample.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserDAOService userDAOService;

    public static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Elon","Admin");
        long id = userDAOService.insert(user);
        log.info("New user created : "+user);
    }
}
