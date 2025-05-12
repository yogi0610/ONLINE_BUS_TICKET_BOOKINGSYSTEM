package com.adventura.bus.model;
import jakarta.persistence.*;
@Entity
public class BusUser 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    public Long getId() 
    { 
        return id; 
    }
    public void setId(Long id) 
    { 
        this.id = id; 
    }
    public String getName() 
    { 
        return username; 
    }
    public void setName(String name) 
    { 
        this.username = name; 
    }
    public String getEmail() 
    { 
        return email; 
    }
    public void setEmail(String email) 
    { 
        this.email = email; 
    }
    public String getPassword() 
    { 
        return password; 
    }
    public void setPassword(String password) 
    { 
        this.password = password; 
    }
}
