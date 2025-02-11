package com.junbean.movieapp.features.feed.presentation.output

import com.junbean.movieapp.features.common.entity.CategoryEntity
import com.junbean.movieapp.features.common.entity.MovieFeedItemEntity

sealed class FeedState {
    data object Loading : FeedState()

    class Main(
        val categories: List<CategoryEntity>
    ) : FeedState()

    class Failed(
        val reason: String
    ): FeedState()
}