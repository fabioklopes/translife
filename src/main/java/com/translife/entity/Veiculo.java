package com.translife.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "tb_veiculos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String model;

    private String color;

    @Column(unique = true)
    private String plates;

    private Integer year;

    private String fuelType;

    private String status;

    @CreationTimestamp
    // Cria um campo dataHora ao criar o registro automaticamente
    private Date created_at;

    @UpdateTimestamp
    // Caso um registro seja atualizado/modificado, o Hibernate adiciona uma dataHora neste campo
    private Date updated_at;


}
