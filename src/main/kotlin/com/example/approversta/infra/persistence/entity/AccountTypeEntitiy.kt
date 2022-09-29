package com.example.approversta.infra.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "account_type")
class AccountTypeEntitiy(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "name")
    val name: String
)
