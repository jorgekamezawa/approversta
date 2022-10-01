package com.btg.pactual.banking.approversta.infra.persistence.entity

import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import javax.persistence.*

@Entity
@Table(name = "tb_fila_aprovacao")
class FilaAprovacaoEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "nome", unique = true)
    val nome: String,
    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @JoinTable(
        name = "tb_fila_aprovacao_tb_email",
        joinColumns = [JoinColumn(name = "fila_aprovacao_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "email_id", referencedColumnName = "id")]
    )
    val emailList: List<EmailEntity>,
    @ManyToMany(mappedBy = "filaAprovacaoList")
    val fluxoRegraAprovacaoList: List<FluxoRegraAprovacaoEntity>
) {
}