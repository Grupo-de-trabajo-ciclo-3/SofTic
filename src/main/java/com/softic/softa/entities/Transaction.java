package com.softic.softa.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor //Al modelar las clases como entidades hay que tener un constructor vacío para evitar errores a futuro.
@Getter
@Setter
@ToString
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transaction", nullable = false)
    private Long idTransaction;

    //Atributos
    @Column(name = "concept_movements")
    private String conceptMovements;
    @Column(name = "amount_movements")
    private float amountMovements;

}
