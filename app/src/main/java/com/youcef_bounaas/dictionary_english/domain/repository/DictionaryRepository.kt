package com.youcef_bounaas.dictionary_english.domain.repository

/**
 * @author Youcef Bounaas
 */


import com.youcef_bounaas.dictionary_english.domain.model.WordItem
import com.youcef_bounaas.dictionary_english.util.Result
import kotlinx.coroutines.flow.Flow


interface DictionaryRepository {
    suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>>



}