package org.mytest.Repo;

import org.mytest.model.UserPayemntModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPayRepo extends JpaRepository<UserPayemntModel,Long> {
}
