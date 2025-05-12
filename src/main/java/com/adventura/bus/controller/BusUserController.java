package com.adventura.bus.controller;
import com.adventura.bus.model.BusUser;
import com.adventura.bus.repository.BusUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") 
public class BusUserController 
{
    @Autowired
    private BusUserRepository userRepository;
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody BusUser user) 
    {
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }
}