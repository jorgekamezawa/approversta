package com.btg.pactual.banking.approversta.infra.persistence.entity

import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "tb_fluxo_regra_aprovacao")
class FluxoRegraAprovacaoEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne
    @JoinColumn(name = "perfil_solicitante_id", referencedColumnName = "id")
    val perfilSolicitante: PerfilEntity,
    @ManyToOne
    @JoinColumn(name = "tipo_operacao_id", referencedColumnName = "id")
    val tipoOperacao: TipoOperacaoEntity,
    @ManyToOne
    @JoinColumn(name = "titularidade_id", referencedColumnName = "id")
    val titularidade: TitularidadeEntity,
    @Column(name = "valor_minimo")
    val valorMinimo: BigDecimal,
    @Column(name = "valor_maximo")
    val valorMaximo: BigDecimal,
    @Column(name = "is_conta_origem_interna")
    val isContaOrigemInterna: Boolean,
    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @JoinTable(
        name = "tb_fluxo_regra_aprovacao_tb_fila_aprovacao",
        joinColumns = [JoinColumn(name = "fluxo_regra_aprovacao_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "fila_aprovacao_id", referencedColumnName = "id")]
    )
    val filaAprovacaoList: List<FilaAprovacaoEntity>
) {
}