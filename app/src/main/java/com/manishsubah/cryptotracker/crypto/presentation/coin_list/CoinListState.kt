package com.manishsubah.cryptotracker.crypto.presentation.coin_list

import com.manishsubah.cryptotracker.crypto.presentation.models.CoinUi


data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: CoinUi? = null
)
