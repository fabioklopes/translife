package com.translife.entity;

public enum Status {
    IN_PROGRESS("Em Andamento"),
    PENDING("Pendente"),
    COMPLETED("Concluído"),
    COLLECTING("Coletando"),
    ISSUE_1("Vendedor não separou o objeto"),
    ISSUE_2("Vendedor não emitiu NF ou NFe da venda"),
    ISSUE_3("Vendedor não entregou o objeto ao transportador"),
    ISSUE_4("Cliente cancelou a compra"),
    COLLECTED("Objeto Coletado"),
    START_TRANSPORT("Início do Transporte"),
    PROBLEMS_DELIVERY("Problemas na Entrega"),
    DELIVERY_ATTEMPT_1("Cliente não localizado"),
    DELIVERY_ATTEMPT_2("Cliente não localizado"),
    DELIVERY_ATTEMPT_3("Cliente não localizado"),
    UNRECOGNIZED_OBJECT("Objeto não reconhecido"),
    DELIVERED("Objeto Entregue"),
    CANCELLED("Cancelado");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
