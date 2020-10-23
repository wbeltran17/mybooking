package com.makingidea.mybooking.repository;

import com.makingidea.mybooking.model.bean.Role;
import com.makingidea.mybooking.model.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}