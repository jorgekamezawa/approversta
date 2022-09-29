package com.example.approversta.domain.entity

class TransactionBatch(
    val id: Long,
    val ruleApprovalFlow: RuleApprovalFlow,
    val approvalStatus: ApprovalStatusEnum,
    val requesterProfileEntity: Profile,
    val transactionList: List<Transaction>
)
