package com.example.firstjpa;

import com.example.firstjpa.dao.UserDao;
import com.example.firstjpa.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoCommandLineRunner implements CommandLineRunner {

    private static  final Logger logger =
            LoggerFactory.getLogger(UserDaoCommandLineRunner.class);

    @Autowired
    UserDao userDao;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("kala");
        int id = userDao.insert(user);
        logger.info("new user is " + user);
    }
}
