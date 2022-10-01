package com.btg.pactual.banking.approversta.infra.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "tb_titularidade")
class TitularidadeEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "nome")
    val nome: String
) {
}