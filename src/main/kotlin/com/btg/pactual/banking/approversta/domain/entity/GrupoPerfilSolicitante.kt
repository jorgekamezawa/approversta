package com.btg.pactual.banking.approversta.domain.entity

class GrupoPerfilSolicitante(
    val id: Long,
    val nome: String,
    val descricao: String,
    val perfilList: List<Perfil>
)
