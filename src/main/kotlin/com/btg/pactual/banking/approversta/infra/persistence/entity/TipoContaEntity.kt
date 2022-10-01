package com.btg.pactual.banking.approversta.infra.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "tb_tipo_conta")
class TipoContaEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "nome", unique = true)
    val nome: String,
    @Column(name = "descricao")
    val descricao: String,
    @Column(name = "sigla", unique = true)
    val sigla: String
) {
}