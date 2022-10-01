package com.btg.pactual.banking.approversta.infra.persistence.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "tb_tarefa_sistema_approver")
class TarefaSistemaApproverEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: UUID,
    @ManyToOne
    @JoinColumn(name = "email_endereco", referencedColumnName = "endereco")
    val emailAprovador: EmailEntity,
    @Column(name = "status")
    val status: String,
    @Column(name = "event")
    val event: String,
    @ManyToOne
    @JoinColumn(name = "fila_aprovacao_nome", referencedColumnName = "nome")
    val filaAprovacao: FilaAprovacaoEntity,
    @ManyToOne
    @JoinColumn(name = "operacao_id", referencedColumnName = "id")
    val operacao: OperacaoEntity
) {
}