package com.debuggeandoideas.app_security.repositories;

import com.debuggeandoideas.app_security.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerEntity, BigInteger> {


    Optional<CustomerEntity> findByEmail(String email);
}