package org.mytest.controller;

import org.mytest.Exception.LoginFailExeption;
import org.mytest.Exception.ResourceNotFoundExeption;
import org.mytest.Repo.UserRepo;
import org.mytest.model.DTO.LoginRequest;
import org.mytest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/v1.0/User")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public List<User> findall(){
        return userRepo.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id")Long id) throws ResourceNotFoundExeption{
        User user = userRepo.findById(id).orElseThrow(()-> new ResourceNotFoundExeption("data tidak ditemukan"));
        return ResponseEntity.ok().body(user);
    }
    @PostMapping("/create")
    public User createUser(@Valid @RequestBody User user){
        return userRepo.save(user);
    }

    @PostMapping("/Login")
    public ResponseEntity<User> loginmdel(@RequestBody LoginRequest loginRequest) throws ResourceNotFoundExeption,LoginFailExeption {
        User user = userRepo.getLogin(loginRequest.getUserName()).orElseThrow(()->new LoginFailExeption("user and password not Match"));
        if(user.getDeleted()) {
            throw new ResourceNotFoundExeption("user not exist");
        }else if(user.getSuspended()){
            throw new LoginFailExeption("user is Suspended please contact Administrator");
        }else if(user.getPassword().equals(loginRequest.getPassword())){
            throw new LoginFailExeption("user and password not Match");
        }
        return ResponseEntity.ok().body(user);

    }

}
