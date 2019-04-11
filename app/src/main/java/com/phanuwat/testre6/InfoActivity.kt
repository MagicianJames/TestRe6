package com.phanuwat.testre6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_info.*
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class InfoActivity : AppCompatActivity() {

    var str = ""
    var strl = ""
    var tv_user: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        btCallRetrofit.setOnClickListener {
            getData()
        }

    }

    fun getData() {

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://vankebab.azurewebsites.net/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(Api::class.java)
        val call = api.getPlaceDetail("31")

        call.enqueue(object : Callback<List<getPlaceDetail>> {
            override fun onResponse(call: Call<List<getPlaceDetail>>, response: Response<List<getPlaceDetail>>) {
                val response = response.body()!![0]
//                print("This is the respose "+response)
                str = response.from.toString()
//                strl = response.body()?.total.toString()

//                Destination.text = str
                venueAbac.text = str
//                Destination.text = "TEST"
//                venueAbac.text = "TEST"
            }

            override fun onFailure(call: Call<List<getPlaceDetail>>, t: Throwable) {
                Log.v("Error", t.toString())
                Toast.makeText(this@InfoActivity, t.toString(), Toast.LENGTH_LONG).show()
            }
        })
    }

}
