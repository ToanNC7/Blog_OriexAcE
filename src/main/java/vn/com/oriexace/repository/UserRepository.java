package vn.com.oriexace.repository;

import java.util.Optional;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.com.oriexace.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	String USERS_BY_LOGIN_CACHE = "usersByLogin";

	@EntityGraph(attributePaths = "role")
	@Cacheable(cacheNames = USERS_BY_LOGIN_CACHE)
	Optional<User> findOneWithAuthoritiesByLogin(String login);
}
