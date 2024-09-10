package com.luischore.trackermovieapp

import com.luischore.trackermovieapp.model.remote.datasource.MovieServiceRemoteDataSourceImpl
import com.luischore.trackermovieapp.model.repository.MovieServiceRepositoryImpl

class AppContainer {
    private val movieServiceRemoteDataSource = MovieServiceRemoteDataSourceImpl()
    val movieServiceRepository = MovieServiceRepositoryImpl(movieServiceRemoteDataSource)
}