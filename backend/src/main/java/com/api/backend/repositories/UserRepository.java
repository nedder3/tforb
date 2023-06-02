package com.api.backend.repositories;

import com.api.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByid(Long id);
    List<User> findByidentificationType(String identificationType);
    List<User> findByuserIdentificationNumber(String userIdentificationNumber);



}
