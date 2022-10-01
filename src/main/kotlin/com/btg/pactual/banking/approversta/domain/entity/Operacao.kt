package com.btg.pactual.banking.approversta.domain.entity

import java.math.BigDecimal

class Operacao(
    val id: Long,
    val codigoBancoPagador: String,
    val bancoPagador: Banco,
    val numeroContaPagador: String,
    val numeroDocumentoPagador: String,
    val tipoContaPagador: TipoConta,
    val nomeClientePagador: String,
    val tipoPessoaPagador: String,
    val bancoFavorecido: Banco,
    val numeroAgenciaFavorecido: String,
    val numeroContaFavorecido: String,
    val numeroDocumentoFavorecido: String,
    val tipoContaFavorecido: TipoConta,
    val nomeClienteFavorecido: String,
    val tipoPessoaFavorecido: String,
    val fluxoRegraAprovacao: FluxoRegraAprovacao,
    val valorTransacao: BigDecimal,
    val categoria: String,
    val statusAprovacao: StatusAprovacaoEnum,
    val tarefaSistemaApproverList: List<TarefaSistemaApprover>
)
