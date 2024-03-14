package com.youcef_bounaas.dictionary_english.data.mapper

import com.youcef_bounaas.dictionary_english.data.dto.DefinitionDto
import com.youcef_bounaas.dictionary_english.data.dto.MeaningDto
import com.youcef_bounaas.dictionary_english.data.dto.WordItemDto
import com.youcef_bounaas.dictionary_english.domain.model.Definition
import com.youcef_bounaas.dictionary_english.domain.model.Meaning
import com.youcef_bounaas.dictionary_english.domain.model.WordItem

/**
 * @author Youcef Bounaas
 */

fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    } ?: emptyList(),
    phonetic = phonetic ?: ""

)

fun MeaningDto.toMeaning() = Meaning (
    definition = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: ""
)

fun definitionDtoToDefinition(
    definitionDto: DefinitionDto?
) = Definition(
    definition  = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""
)