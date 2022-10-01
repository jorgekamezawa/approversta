package com.btg.pactual.banking.approversta.infra.persistence.entity

import com.btg.pactual.banking.approversta.domain.entity.StatusAprovacaoEnum
import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "tb_operacao")
class OperacaoEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne
    @JoinColumn(name = "banco_pagador_id", referencedColumnName = "codigo")
    val bancoPagador: BancoEntity,
    @Column(name = "numero_agencia_pagador")
    val numeroAgenciaPagador: String,
    @Column(name = "numero_conta_pagador")
    val numeroContaPagador: String,
    @Column(name = "numero_documento_pagador")
    val numeroDocumentoPagador: String,
    @ManyToOne
    @JoinColumn(name = "tipo_conta_pagador_sigla", referencedColumnName = "sigla")
    val tipoContaPagador: TipoContaEntity,
    @Column(name = "nome_cliente_pagador")
    val nomeClientePagador: String,
    @Column(name = "tipo_pessoa_pagador")
    val tipoPessoaPagador: String,
    @ManyToOne
    @JoinColumn(name = "banco_favorecido_id", referencedColumnName = "codigo")
    val bancoFavorecido: BancoEntity,
    @Column(name = "numero_agencia_favorecido")
    val numeroAgenciaFavorecido: String,
    @Column(name = "numero_conta_favorecido")
    val numeroContaFavorecido: String,
    @Column(name = "numero_documento_favorecido")
    val numeroDocumentoFavorecido: String,
    @ManyToOne
    @JoinColumn(name = "tipo_conta_favorecido_sigla", referencedColumnName = "sigla")
    val tipoContaFavorecido: TipoContaEntity,
    @Column(name = "nome_cliente_favorecido")
    val nomeClienteFavorecido: String,
    @Column(name = "tipo_pessoa_favorecido")
    val tipoPessoaFavorecido: String,
    @ManyToOne
    @JoinColumn(name = "fluxo_regra_aprovacao_id", referencedColumnName = "id")
    val fluxoRegraAprovacao: FluxoRegraAprovacaoEntity,
    @Column(name = "valor_transacao")
    val valorTransacao: BigDecimal,
    @Column(name = "categoria")
    val categoria: String,
    @Column(name = "status_aprovacao")
    val statusAprovacao: StatusAprovacaoEnum
)
