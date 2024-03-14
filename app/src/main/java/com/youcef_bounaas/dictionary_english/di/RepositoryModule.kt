package com.youcef_bounaas.dictionary_english.di

import com.youcef_bounaas.dictionary_english.domain.repository.DictionaryRepository
import com.youcef_bounaas.dictionaryç_english.data.repository.DictionaryRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @author Youcef Bounaas
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindDictionaryRepository(
        dictionaryRepositoryImpl: DictionaryRepositoryImpl
    ): DictionaryRepository

}

