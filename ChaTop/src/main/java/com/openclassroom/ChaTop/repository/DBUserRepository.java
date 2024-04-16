package com.openclassroom.ChaTop.repository;

import com.openclassroom.ChaTop.model.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBUserRepository extends JpaRepository<DBUser, Integer> {
    public DBUser findByUsername(String username);
}