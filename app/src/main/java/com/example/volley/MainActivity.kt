package com.example.volley

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://www.youtube.com"


        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> {response ->
                Log.d("tag",response.substring(0,500))
            },
            Response.ErrorListener { Log.d("tag", "Error") })


        // Add the request to the RequestQueue.
        queue.add(stringRequest)


    }
}
