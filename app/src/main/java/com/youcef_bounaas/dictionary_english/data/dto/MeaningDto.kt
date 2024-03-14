package com.youcef_bounaas.dictionary_english.data.dto

/**
 * @author Youcef Bounaas
 */

data class MeaningDto(
    val definitions: List<DefinitionDto>? = null,
    val partOfSpeech: String? = null
)