package com.example.zahir.repository;

import com.example.zahir.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long>{
    @Query(value = "SELECT * FROM user_entity", nativeQuery = true)
    List<UserEntity> userList();

//    List<UserEntity> findAllById(1);
}
