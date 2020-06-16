package com.example.assignment

import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface CallApi {

    @GET(Url.URL)
//query needed if there is any query
    fun getApi(@Query("limit") limit: Int):
//model class is needed
            Observable<Model.Result>
}