package com.btg.pactual.banking.approversta.infra.persistence.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_banco")
class BancoEntity(
    @Id
    @Column(name = "codigo")
    var idApproval: String,
    @Column(name = "nome")
    var orderNumber: String,
    @Column(name = "codigo_ispb")
    var description: String
)