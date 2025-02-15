package com.junbean.movieapp.features.feed.presentation.input

import com.junbean.movieapp.features.feed.presentation.output.FeedState
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

interface IFeedViewModelInput {
    fun openDetail(movieName: String)
    fun openInfoDialog()
    fun refreshFeed()
}
