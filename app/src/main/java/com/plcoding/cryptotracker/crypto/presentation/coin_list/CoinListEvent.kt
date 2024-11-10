package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.core.domain.util.NetworkError

// From ViewModel to UI
sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}