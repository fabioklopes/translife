package com.translife.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_coletas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Transient
    @ManyToOne
    @JoinColumn(
        name = "cliente_id",
        referencedColumnName = "id",
        foreignKey = @ForeignKey(name = "fk_coleta_cliente")
    )
    private Cliente client;

    @Column(unique = true, length = 19, nullable = false, updatable = false) // === 20240613-154210-123
    private String objectCode;

    @Enumerated(EnumType.STRING)
    private VolumeType volumeType;

    @Column(length = 120, nullable = false)
    private String collectionSource;

    @Column(length = 120, nullable = false)
    private String collectionDestination;

    @Column(length = 50, nullable = false)
    private String collectionSourceResponsible;

    @Column(length = 11, nullable = false)
    private String documentSourceResponsible;

    @Column(length = 50, nullable = false)
    private String receiptDestinationResponsible;

    @Column(length = 11, nullable = false)
    private String documentReceiptResponsible;

    private LocalDateTime collectionDate;

    private LocalDateTime receiptDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(length = 500)
    private String details;
}
