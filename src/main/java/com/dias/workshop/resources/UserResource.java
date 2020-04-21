package com.dias.workshop.resources;

import com.dias.workshop.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1","maria", "maria@gmail.com");
        User alex = new User("2","matheus", "alex@gmail.com");
        User matheus = new User("3","matheus", "matheus@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria,alex,matheus));
        return ResponseEntity.ok().body(list);
    }
}
