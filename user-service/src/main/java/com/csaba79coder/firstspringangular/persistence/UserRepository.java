package com.csaba79coder.firstspringangular.persistence;

import com.csaba79coder.firstspringangular.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
