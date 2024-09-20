package com.matheusandrade.webserviceproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.matheusandrade.webserviceproject.entities.User;

//instantiates the repository object with standard implemantation of JPARepository, save data on database
public interface UserRepository extends JpaRepository<User, Long> {
    
}
