package com.example.approversta.domain.entity

import java.math.BigDecimal

class RuleApprovalFlow(
    val id: Long,
    val profile: Profile,
    val type: Type,
    val accountType: AccountType,
    val minAmount: BigDecimal,
    val maxAmount: BigDecimal,
    val lastCondition: LastCondition,
    val approvalQueueList: List<ApprovalQueue>
)
