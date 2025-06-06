package com.mysite.applyhome.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
	Optional<Users> findByUserLoginId(String username);
}
