package com.luischore.trackermovieapp.model.repository

import com.luischore.trackermovieapp.model.remote.datasource.MovieServiceRemoteDataSource

class MovieServiceRepositoryImpl(
    private val movieServiceRemoteDataSource: MovieServiceRemoteDataSource
):MovieServiceRepository {
}