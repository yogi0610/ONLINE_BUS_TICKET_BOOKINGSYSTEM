package com.adventura.bus.service;
import com.adventura.bus.model.BusUser;
import com.adventura.bus.repository.BusUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class BusUserService 
{
    @Autowired
    private BusUserRepository busUserRepository;
    public BusUser registerUser(BusUser user) 
    {
        Optional<BusUser> existingUser = busUserRepository.findByEmail(user.getEmail());
        if (existingUser.isPresent()) 
        {
            throw new RuntimeException("Email already registered.");
        }
        return busUserRepository.save(user);
    }
    public Optional<BusUser> getUserByEmail(String email) 
    {
        return busUserRepository.findByEmail(email);
    }
}
