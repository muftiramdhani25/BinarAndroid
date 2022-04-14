package com.mufti.binarandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit: Button = findViewById(R.id.btn_submit)
        btnSubmit.setOnClickListener{

            val edtNama: EditText = findViewById(R.id.edt_name)
            val edtUmur: EditText = findViewById(R.id.edt_umur)
            val edtDomisili: EditText = findViewById(R.id.edt_domisili)
            val edtStatus: EditText = findViewById(R.id.edt_status)

            val name = edtNama.text.toString()
            val umur = edtUmur.text.toString()
            val domisili = edtDomisili.text.toString()
            val status = edtStatus.text.toString()

            val person = Person(name, umur.toInt(), domisili, status.toBoolean())

            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra(DetailActivity.NAMA_PERSON, person.name)
            intent.putExtra(DetailActivity.UMUR_PERSON, person.umur)
            intent.putExtra(DetailActivity.DOMISILI_PERSON, person.domisili)
            intent.putExtra(DetailActivity.STATUS_PERSON, person.statusMenikah)
            startActivity(intent)
        }

    }
}