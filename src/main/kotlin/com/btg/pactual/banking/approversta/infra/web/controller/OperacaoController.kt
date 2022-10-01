package com.btg.pactual.banking.approversta.infra.web.controller

import com.btg.pactual.banking.approversta.usecase.service.OperacaoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/operations")
class OperacaoController(
    private val operacaoService: OperacaoService
) {

    @PostMapping
    fun criarOperacoesPorLote(
        @RequestParam("file") file: MultipartFile
    ): ResponseEntity<Any> {
        operacaoService.processarAquivoDeOperacao(file)
        return ResponseEntity(HttpStatus.CREATED)
    }
}