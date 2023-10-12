package com.softwiz.security.repository;

import com.softwiz.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}
