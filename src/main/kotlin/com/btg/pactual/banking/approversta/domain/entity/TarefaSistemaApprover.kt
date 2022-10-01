package com.btg.pactual.banking.approversta.domain.entity

import java.util.*

class TarefaSistemaApprover(
    val id: UUID,
    val emailAprovador: String,
    val status: String,
    val event: String,
    val filaAprovacao: FilaAprovacao
)
