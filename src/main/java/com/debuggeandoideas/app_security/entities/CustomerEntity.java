package com.debuggeandoideas.app_security.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigInteger;

@Entity
@Table(name="customers")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CustomerEntity {
    @Id
    BigInteger id;
    String email;

    @Column(name = "pwd")
    String password;
    @Column(name = "rol")
    String role;
}
