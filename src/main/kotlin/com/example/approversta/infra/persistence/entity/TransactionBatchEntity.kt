package com.example.approversta.infra.persistence.entity

import com.example.approversta.domain.entity.ApprovalStatusEnum
import javax.persistence.*

@Entity
@Table(name = "transaction_batch")
class TransactionBatchEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne
    val ruleApprovalFlow: RuleApprovalFlowEntity,
    @Enumerated(EnumType.STRING)
    val approvalStatus: ApprovalStatusEnum,
    @ManyToOne
    val requesterProfileEntity: ProfileEntity,
    @OneToMany
    val transactionList: List<TransactionEntity>
)
