package com.junbean.movieapp.features.common.repository

import com.junbean.movieapp.features.common.entity.CategoryEntity
import com.junbean.movieapp.features.common.entity.EntityWrapper
import com.junbean.movieapp.features.common.entity.MovieDetailEntity
import com.junbean.movieapp.features.feed.domain.SortOrder

interface IMovieDataSource {
    // suspend fun getMovieList()
    suspend fun getCategories(sortOrder: SortOrder? = null): EntityWrapper<List<CategoryEntity>>
    suspend fun getMovieDetail(movieName: String): MovieDetailEntity
}