package com.youcef_bounaas.dictionary_english.data.dto

/**
 * @author Youcef Bounaas
 */

data class WordItemDto(
    val meanings: List<MeaningDto>? = null,
    val phonetic: String? = null,
    val word: String? = null
)