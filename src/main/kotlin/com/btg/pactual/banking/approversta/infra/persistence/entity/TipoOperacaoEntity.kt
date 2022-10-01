package com.btg.pactual.banking.approversta.infra.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "tb_tipo_operacao")
class TipoOperacaoEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "nome")
    var nome: String,
    @Column(name = "codigo", unique = true)
    val codigo: Long,
    @Column(name = "descricao")
    var descricao: String,
) {
}