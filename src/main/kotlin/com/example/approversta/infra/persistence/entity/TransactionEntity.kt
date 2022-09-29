package com.example.approversta.infra.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "transaction")
class TransactionEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "name")
    val data: String,
    @ManyToOne
    val transactionBatch: TransactionBatchEntity
)
