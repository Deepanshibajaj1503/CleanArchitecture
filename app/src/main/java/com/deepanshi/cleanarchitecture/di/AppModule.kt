package com.deepanshi.cleanarchitecture.di

import com.deepanshi.cleanarchitecture.common.Constants
import com.deepanshi.cleanarchitecture.data.remote.UsersApi
import com.deepanshi.cleanarchitecture.data.remote.repository.UsersRepositoryImpl
import com.deepanshi.cleanarchitecture.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUsersApi(): UsersApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(UsersApi::class.java)
    }

    @Provides
    @Singleton
    fun provideUsersRepository(api: UsersApi): UserRepository {
        return UsersRepositoryImpl(api)
    }
}