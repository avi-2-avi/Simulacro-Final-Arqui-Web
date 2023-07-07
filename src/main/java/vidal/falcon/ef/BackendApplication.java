package vidal.falcon.ef;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import vidal.falcon.ef.entities.Authority;
import vidal.falcon.ef.entities.AuthorityName;
import vidal.falcon.ef.entities.User;
import vidal.falcon.ef.repositories.AuthorityRepository;
import vidal.falcon.ef.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingApplication(
			UserRepository userRepository,
			AuthorityRepository authorityRepository
	) {
		return args -> {
			/*
			authorityRepository.save(new Authority(AuthorityName.ROLE_ADMIN));
			authorityRepository.save(new Authority(AuthorityName.ROLE_USER));

			userRepository.save(
					new User("admin",new BCryptPasswordEncoder().encode("admin"),
							List.of(
									authorityRepository.findByName(AuthorityName.ROLE_ADMIN)
							)
					)
			);
			 */
		};
	};
}
