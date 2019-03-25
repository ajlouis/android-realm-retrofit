package com.example.retrofit

import com.example.models.Theme
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface ThemeService {
    @GET("/themes")

    fun getThemes(
        @Query("name") name: String,
        @Query("image") image: String
    ): Observable
}