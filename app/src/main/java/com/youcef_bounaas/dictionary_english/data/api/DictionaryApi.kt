package com.youcef_bounaas.dictionary_english.data.api

/**
 * @author Youcef Bounaas
 */

import com.youcef_bounaas.dictionary_english.data.dto.WordResultDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("{word}")
    suspend fun getWordResult(
        @Path("word") word: String
    ): WordResultDto?

    companion object {
        const val Base_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/"
    }

}