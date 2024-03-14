package com.youcef_bounaas.dictionary_english.domain.model

/**
 * @author Youcef Bounaas
 */

data class WordItem(
    val word: String,
    val meanings: List<Meaning>,
    val phonetic: String
)
