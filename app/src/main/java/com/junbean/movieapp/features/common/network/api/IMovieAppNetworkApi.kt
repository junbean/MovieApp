package com.junbean.movieapp.features.common.network.api

import com.junbean.movieapp.features.common.network.model.MovieResponse
import com.junbean.movieapp.library.network.model.ApiResult

interface IMovieAppNetworkApi {
    suspend fun getMovies(): ApiResult<List<MovieResponse>>
}