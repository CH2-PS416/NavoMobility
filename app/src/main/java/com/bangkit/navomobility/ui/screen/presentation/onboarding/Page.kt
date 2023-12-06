package com.bangkit.navomobility.ui.screen.presentation.onboarding

import androidx.annotation.DrawableRes
import com.bangkit.navomobility.R

data class Page(
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        description = "Welcome to Navo Mobility! Discover unforgettable adventures with our transportation recommendations.",
        image = R.drawable.prolog
    ),
    Page(
        description = "Experience boundless journeys with NavoMobility. We help you find the best transportation options for the tourist destination or city of your choice.",
        image = R.drawable.prolog1
    ),
    Page(
        description = "Explore the world with ease. NavoMobility not only provides transportation recommendations but also ensures each of your journeys is memorable. Let's get started!",
        image = R.drawable.prolog2
    )
)
