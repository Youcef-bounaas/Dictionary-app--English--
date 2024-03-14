package com.youcef_bounaas.dictionary_english.presentation

/**
 * @author Youcef Bounaas
 */

sealed class MainUiEvents {
    data class OnSearchWordChange(
        val newWord: String
    ) : MainUiEvents()
    object OnSearchClick: MainUiEvents()
}