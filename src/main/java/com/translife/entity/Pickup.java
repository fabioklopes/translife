package com.translife.entity;

import java.time.LocalDateTime;

public class Pickup {

    private Long id;

    private Cliente client;

    private String objectCode;

    private String volume; // Documento, pacote ou caixa

    private String collectionSource;

    private String collectionDestination;

    private String collectionSourceResponsible;

    private String receiptDestinationResponsible;

    private LocalDateTime collectionDate;

    private LocalDateTime receiptDate;

    private String status;

    private String details;
}
