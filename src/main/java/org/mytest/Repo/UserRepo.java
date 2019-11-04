package org.mytest.Repo;

import org.mytest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    @Query(value = "SELECT * FROM users u where u.username =?1",nativeQuery = true)
     public Optional<User> getLogin(String username);
}
