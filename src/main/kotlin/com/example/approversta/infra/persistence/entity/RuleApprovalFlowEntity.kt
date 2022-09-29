package com.example.approversta.infra.persistence.entity

import java.math.BigDecimal
import javax.persistence.*

@Entity
@Table(name = "rule_approval_flow")
class RuleApprovalFlowEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne
    val profile: ProfileEntity,
    @ManyToOne
    val type: TypeEntity,
    @ManyToOne
    val accountType: AccountTypeEntitiy,
    @Column
    val minAmount: BigDecimal,
    @Column
    val maxAmount: BigDecimal,
    @ManyToOne
    val lastCondition: LastConditionEntity,
    @ManyToMany
    val approvalQueueList: List<ApprovalQueueEntity>
)
