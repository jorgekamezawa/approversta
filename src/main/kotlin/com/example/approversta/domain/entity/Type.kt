package com.example.approversta.domain.entity

class Type(
    val id: Long,
    val name: String,
    val requesterGroupList: List<RequesterGroup>
)
