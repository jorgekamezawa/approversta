package com.example.approversta.infra.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "requester_group")
class RequesterGroupEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "name")
    val name: String,
    val profileList: List<ProfileEntity>
)
