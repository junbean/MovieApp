package com.junbean.movieapp.features.common.repository

interface IMovieDataSource {
    suspend fun getMovieList()
}