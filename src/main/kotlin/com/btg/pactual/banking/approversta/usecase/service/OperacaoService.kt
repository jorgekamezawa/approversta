package com.btg.pactual.banking.approversta.usecase.service

import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class OperacaoService(
    private val converterCsvParaDtoService: ConverterCsvParaDtoService
) {

    fun processarAquivoDeOperacao(file: MultipartFile) {
        val operacaoCsvDtoList = converterCsvParaDtoService.converter(file)
    }
}
