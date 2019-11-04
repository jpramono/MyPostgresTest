package org.mytest.Repo;

import org.mytest.model.Bio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import java.util.Optional;

@Repository
public interface BioRepo extends JpaRepository<Bio,Long> {
    @Query(value = "select * from UserDetail u where u.user_id=?1",nativeQuery = true)
    public Optional<Bio> getbyUserid(Long user_id);
}
