package com.btg.pactual.banking.approversta.infra.persistence.entity

import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import javax.persistence.*

@Entity
@Table(name = "tb_grupo_perfil_solicitante")
class GrupoPerfilSolicitanteEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(name = "nome")
    val nome: String,
    @Column(name = "descricao")
    val descricao: String,
    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @JoinTable(
        name = "tb_grupo_perfil_solicitante_tb_perfil",
        joinColumns = [JoinColumn(name = "grupo_perfil_solicitante_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "perfil_id", referencedColumnName = "id")]
    )
    val perfilList: List<PerfilEntity>
) {
}