package com.security.auth2;

import com.security.auth2.entity.AppUser;
import com.security.auth2.repository.AppUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

// this is to disable default login page from spring security
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Oauth2BlogApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Oauth2BlogApplication.class, args);


        AppUserRepository appUserRepository = run.getBean("appUserRepository", AppUserRepository.class);

        AppUser appUser = new AppUser();
        appUser.setUserEmail("123@gmail.com");
        appUser.setUserPass("123");
        appUser.setUserRole("ADMIN");
        appUserRepository.save(appUser);


    }
}
