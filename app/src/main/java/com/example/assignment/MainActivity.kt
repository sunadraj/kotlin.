package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import okhttp3.*
import okhttp3.Request.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private val client = OkHttpClient()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        run("https://api.github.com/users/Evin1-/repos")

        ApiData.apiData( object :ApiData.Response{
            override fun data(data: Model.Result, status: Boolean) {
                if(status){
                    val items:List<Model.Children> = data.data.children
                }
            }

        })

    }

    fun run(url: String) {
        val request = Builder()
                .url(url)
                .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response) = println(response.body()?.string())
        })
    }
    }
