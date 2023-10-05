package com.victorhugo.userhandler.repositories;

import com.victorhugo.userhandler.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
