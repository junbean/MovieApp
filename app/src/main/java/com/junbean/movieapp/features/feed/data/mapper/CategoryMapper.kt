package com.junbean.movieapp.features.feed.data.mapper

import com.junbean.movieapp.features.common.entity.CategoryEntity
import com.junbean.movieapp.features.common.entity.EntityWrapper
import com.junbean.movieapp.features.common.entity.MovieDetailEntity
import com.junbean.movieapp.features.common.mapper.BaseMapper
import com.junbean.movieapp.features.common.network.model.MovieResponse
import com.junbean.movieapp.features.feed.data.FeedConstants
import com.junbean.movieapp.features.feed.domain.SortOrder
import com.junbean.movieapp.library.storage.IStorage
import javax.inject.Inject

class CategoryMapper @Inject constructor(
    private val storage: IStorage
) : BaseMapper<List<MovieResponse>, List<CategoryEntity>>() {
    override fun getSuccess(
        model: List<MovieResponse>?,
        extra: Any?
    ): EntityWrapper.Success<List<CategoryEntity>> {
        return model?.let {
            EntityWrapper.Success(
                entity = mutableListOf<MovieDetailEntity>()
                    .apply {
                        addAll(model.map { it.toMovieDetailEntity() })
                    }
                    .also {
                        storage.save(FeedConstants.MOVIE_LIST_KEY, it)
                    }
                    .map {
                        it.toMovieThumbnailEntity()
                    }
                    .toCategoryList(if (extra is SortOrder) extra else SortOrder.RATING)
            )
        } ?: EntityWrapper.Success(
            entity = listOf()
        )
    }

    override fun getFailure(error: Throwable): EntityWrapper.Fail<List<CategoryEntity>> {
        return EntityWrapper.Fail(error)
    }
}