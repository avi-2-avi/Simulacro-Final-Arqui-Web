package vidal.falcon.ef.repositories;

import vidal.falcon.ef.entities.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, Long> {
}
