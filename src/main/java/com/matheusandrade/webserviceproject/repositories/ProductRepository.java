package com.matheusandrade.webserviceproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.matheusandrade.webserviceproject.entities.Product;

//instantiates the repository object with standard implemantation of JPARepository, save data on database
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
