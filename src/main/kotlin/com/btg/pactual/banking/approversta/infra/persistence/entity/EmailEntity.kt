package com.btg.pactual.banking.approversta.infra.persistence.entity

import javax.persistence.*

@Entity
@Table(name = "tb_email")
class EmailEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "endereco", unique = true)
    val endereco: String,
    @ManyToMany(mappedBy = "emailList")
    val filaAprovacaoList: List<FilaAprovacaoEntity>
) {
}