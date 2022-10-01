package com.btg.pactual.banking.approversta.domain.entity

import java.math.BigDecimal

class FluxoRegraAprovacao(
    val id: Long,
    val perfil: Perfil,
    val tipoOperacao: TipoOperacao,
    val titularidade: Titularidade,
    val valorMinimo: BigDecimal,
    val valorMaximo: BigDecimal,
    val isContaOrigemInterna: Boolean,
    val filaAprovacaoList: List<FilaAprovacao>
)
