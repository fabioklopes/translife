package com.translife.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.translife.entity.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
    /*
     * JPARepository já implementa todas as funcionalidades do CRUD:
     * create, read, update e delete.
     */

    // Busca por placa
    // Optional<Veiculo> findByPlatesOptional(String plates);

}
