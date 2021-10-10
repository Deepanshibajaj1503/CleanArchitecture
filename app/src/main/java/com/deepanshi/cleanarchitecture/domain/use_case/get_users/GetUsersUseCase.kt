package com.deepanshi.cleanarchitecture.domain.use_case.get_users

import com.deepanshi.cleanarchitecture.common.Resource
import com.deepanshi.cleanarchitecture.data.remote.dto.toUser
import com.deepanshi.cleanarchitecture.domain.model.User
import com.deepanshi.cleanarchitecture.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(): Flow<Resource<List<User>>> = flow {
        try {
            emit(Resource.Loading<List<User>>())
            val users = repository.getUsers().map { it.toUser() }
            emit(Resource.Success<List<User>>(users))
        } catch(e: HttpException) {
            emit(Resource.Error<List<User>>(e.localizedMessage ?: "An unexpected error occured"))
        } catch(e: IOException) {
            emit(Resource.Error<List<User>>("Couldn't reach server. Check your internet connection."))
        }
    }
}