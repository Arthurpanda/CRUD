package net.proselyte.springbootdemo.repo;

import net.proselyte.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
   // List <User> findByLasttName(String LastName);
}
