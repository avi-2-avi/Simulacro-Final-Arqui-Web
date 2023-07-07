package vidal.falcon.ef.repositories;

import vidal.falcon.ef.entities.Authority;
import vidal.falcon.ef.entities.AuthorityName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority,Long> {
    public Authority findByName(AuthorityName name);
}
