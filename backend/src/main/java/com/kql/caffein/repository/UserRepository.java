package com.kql.caffein.repository;

import com.kql.caffein.entity.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
    User findByUserNo(String userNo);

    @Transactional
    void deleteByUserNo(String userNo);
}