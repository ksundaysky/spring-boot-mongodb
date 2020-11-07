package com.ksundaysky.springbootmongodb.resource;

import com.ksundaysky.springbootmongodb.document.User;
import com.ksundaysky.springbootmongodb.repository.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    private final UsersRepository usersRepository;

    public UserResource(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<User> getAll() {
        return usersRepository.findAll();
    }
}
