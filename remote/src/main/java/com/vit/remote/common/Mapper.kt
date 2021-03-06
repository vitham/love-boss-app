package com.vit.remote.common

internal interface Mapper<M, E> {
    fun mapToEntity(type: M): E

    fun mapFromEntity(type: E): M
}