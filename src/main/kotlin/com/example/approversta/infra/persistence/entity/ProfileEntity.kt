package com.example.approversta.infra.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "profile")
class ProfileEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "name")
    val name: String
)
