package com.sachin.animalscomposemvi.di

import com.sachin.animalscomposemvi.data.remote.ApiService
import com.sachin.animalscomposemvi.data.repository.AnimalRepositoryImpl
import com.sachin.animalscomposemvi.domain.repository.AnimalRepository
import com.sachin.animalscomposemvi.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @DispatchersIO
    fun providesCoroutineDispatcherIo(): CoroutineDispatcher = Dispatchers.IO

    @Provides
    @Singleton
    fun providesAnimalRepository(apiService: ApiService): AnimalRepository =
        AnimalRepositoryImpl(apiService)

}