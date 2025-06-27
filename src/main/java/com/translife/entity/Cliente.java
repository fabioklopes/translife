package com.translife.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String first_name;

    @Column(length = 100)
    private String last_name;

    @Column(length = 150)
    private String address;

    private String neighborhood;

    private String city;

    @Column(length = 2)
    private String state;

    @Column(length = 9)
    private String zip;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phone;

    private Boolean active;

    @CreationTimestamp
    private LocalDateTime created_at;

    @UpdateTimestamp
    private LocalDateTime updated_at;
}
