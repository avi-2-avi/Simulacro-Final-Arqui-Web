package vidal.falcon.ef.repositories;

import vidal.falcon.ef.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUserName(String userName);
}
