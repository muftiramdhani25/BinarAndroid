package com.mufti.binarandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit: Button = findViewById(R.id.btn_submit)
        btnSubmit.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.btn_submit -> {
                val person = Person("Muhammad Mufti Ramdhani", 23, "Lampung", false)

                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.NAMA_PERSON, person.name)
                intent.putExtra(DetailActivity.UMUR_PERSON, person.umur)
                intent.putExtra(DetailActivity.DOMISILI_PERSON, person.domisili)
                intent.putExtra(DetailActivity.STATUS_PERSON, person.statusMenikah)
                startActivity(intent)
            }
        }
    }
}