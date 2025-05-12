package com.adventura.bus.repository;
import com.adventura.bus.model.BusUser;
import java.util.Optional;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BusUserRepository extends JpaRepository<BusUser, Long> 
{
    Optional<BusUser> findByEmail(String email);
    void save(User user);
}
