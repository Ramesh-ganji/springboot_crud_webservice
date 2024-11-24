package com.javaguides.spring_boot_crud_restapi_microservices.repository;

import com.javaguides.spring_boot_crud_restapi_microservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
