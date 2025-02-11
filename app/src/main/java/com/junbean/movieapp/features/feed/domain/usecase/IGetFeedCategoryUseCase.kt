package com.junbean.movieapp.features.feed.domain.usecase

import com.junbean.movieapp.features.common.entity.CategoryEntity
import com.junbean.movieapp.features.common.entity.EntityWrapper
import com.junbean.movieapp.features.feed.domain.SortOrder

interface IGetFeedCategoryUseCase {
    suspend operator fun invoke(sortOrder: SortOrder? = null) : EntityWrapper<List<CategoryEntity>>
}