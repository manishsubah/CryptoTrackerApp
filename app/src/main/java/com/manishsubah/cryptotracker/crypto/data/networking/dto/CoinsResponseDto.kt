package com.manishsubah.cryptotracker.crypto.data.networking.dto

import com.manishsubah.cryptotracker.crypto.data.networking.dto.CoinDto
import kotlinx.serialization.Serializable

@Serializable
data class CoinsResponseDto(
    val data: List<CoinDto>
)