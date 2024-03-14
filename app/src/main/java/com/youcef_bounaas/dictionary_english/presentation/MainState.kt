package com.youcef_bounaas.dictionary_english.presentation

import com.youcef_bounaas.dictionary_english.domain.model.WordItem

/**
 * @author Youcef Bounaas
 */

data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",

    val wordItem: WordItem? = null
)
