package com.csaba79coder.firstspringangular.bootstrap;

import com.csaba79coder.firstspringangular.entity.User;
import com.csaba79coder.firstspringangular.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    private final UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User();
        user.setEmail("csabavadasz79@gmail.com");
        user.setFirstName("Csaba");
        user.setMidName(null);
        user.setLastName("Vadasz");
        user.setPhoneNumber("+36+30...");
        user.setJobTitle("Java/Spring backend developer");

        userRepository.save(user);
    }
}
