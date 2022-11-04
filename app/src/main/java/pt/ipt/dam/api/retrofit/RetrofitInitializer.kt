package pt.ipt.dam.api.retrofit

import pt.ipt.dam.api.retrofit.service.NoteService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://10.0.2.2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun noteService() = retrofit.create(NoteService::class.java)
}