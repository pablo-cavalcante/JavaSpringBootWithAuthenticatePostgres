package com.designerpatterns.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    @Query("""
           SELECT u
           FROM UserEntity u
           WHERE (LOWER(u.username) = LOWER(:username))
           """)
    UserEntity findByName(@Param("username") String username);
}
