package com.btg.pactual.banking.approversta.usecase.dto

import com.opencsv.bean.CsvBindByName

data class OperacaoCsvDto(
    @CsvBindByName(column = "AccountDebit")
    var AccountDebit: String? = null,
    @CsvBindByName(column = "AccountTypeDebit")
    var AccountTypeDebit: String? = null,
    @CsvBindByName(column = "BankDebit")
    var BankDebit: String? = null,
    @CsvBindByName(column = "BranchDebit")
    var BranchDebit: String? = null,
    @CsvBindByName(column = "DocumentNumberDebit")
    var DocumentNumberDebit: String? = null,
    @CsvBindByName(column = "IspbDebit")
    var IspbDebit: String? = null,
    @CsvBindByName(column = "NameDebit")
    var NameDebit: String? = null,
    @CsvBindByName(column = "AccountCredit")
    var AccountCredit: String? = null,
    @CsvBindByName(column = "AccountTypeCredit")
    var AccountTypeCredit: String? = null,
    @CsvBindByName(column = "BankCredit")
    var BankCredit: String? = null,
    @CsvBindByName(column = "BranchCredit")
    var BranchCredit: String? = null,
    @CsvBindByName(column = "DocumentNumberCredit")
    var DocumentNumberCredit: String? = null,
    @CsvBindByName(column = "IspbCredit")
    var IspbCredit: String? = null,
    @CsvBindByName(column = "NameCredit")
    var NameCredit: String? = null,
    @CsvBindByName(column = "KeyPixCredit")
    var KeyPixCredit: String? = null,
    @CsvBindByName(column = "Amount")
    var Amount: String? = null,
    @CsvBindByName(column = "Type")
    var Type: String? = null,
    @CsvBindByName(column = "Reason")
    var Reason: String? = null,
    @CsvBindByName(column = "Origin")
    var Origin: String? = null,
    @CsvBindByName(column = "TransferCode")
    var TransferCode: String? = null,
    @CsvBindByName(column = "PurposeCode")
    var PurposeCode: String? = null,
    @CsvBindByName(column = "ScheduleDate")
    var ScheduleDate: String? = null
)
