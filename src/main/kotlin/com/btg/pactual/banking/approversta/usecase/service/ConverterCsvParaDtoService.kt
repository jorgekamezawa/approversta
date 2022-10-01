package com.btg.pactual.banking.approversta.usecase.service

import com.btg.pactual.banking.approversta.usecase.dto.OperacaoCsvDto
import com.opencsv.bean.CsvToBean
import com.opencsv.bean.CsvToBeanBuilder
import org.springframework.web.multipart.MultipartFile
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class ConverterCsvParaDtoService {

    fun converter(file: MultipartFile): MutableList<OperacaoCsvDto> {
        throwIfFileEmpty(file)
        var fileReader: BufferedReader? = null
        try {
            fileReader = BufferedReader(InputStreamReader(file.inputStream))
            val csvToBean = createCSVToBean(fileReader)
            return csvToBean.parse()
        } catch (ex: Exception) {
            throw RuntimeException("Error during csv import")
        } finally {
            closeFileReader(fileReader)
        }
    }

    private fun createCSVToBean(fileReader: BufferedReader?): CsvToBean<OperacaoCsvDto> =
        CsvToBeanBuilder<OperacaoCsvDto>(fileReader)
            .withType(OperacaoCsvDto::class.java)
            .build()


    private fun throwIfFileEmpty(file: MultipartFile) {
        if (file.isEmpty)
            throw RuntimeException("Empty file")
    }

    private fun closeFileReader(fileReader: BufferedReader?) {
        try {
            fileReader!!.close()
        } catch (ex: IOException) {
            throw RuntimeException("Error during csv import")
        }
    }
}