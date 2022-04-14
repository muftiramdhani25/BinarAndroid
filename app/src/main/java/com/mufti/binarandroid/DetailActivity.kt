package com.mufti.binarandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object{
        const val NAMA_PERSON = "nama_person"
        const val UMUR_PERSON = "umur_person"
        const val DOMISILI_PERSON = "domisili_person"
        const val STATUS_PERSON = "status_person"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNama : TextView = findViewById(R.id.txt_nama)
        val tvUmur : TextView = findViewById(R.id.txt_umur)
        val tvDomisili : TextView = findViewById(R.id.txt_domisili)
        val tvStatus : TextView = findViewById(R.id.txt_status)

        val personName = intent.getStringExtra(NAMA_PERSON)
        val personUmur = intent.getIntExtra(UMUR_PERSON, 0)
        val personDomisili = intent.getStringExtra(DOMISILI_PERSON)
        val personStatus = intent.getBooleanExtra(STATUS_PERSON, false)

        tvNama.text = "Nama: $personName"
        tvUmur.text = "Umur: $personUmur"
        tvDomisili.text = "Domisili: $personDomisili"
        tvStatus.text = "Status Nikah: $personStatus"

    }
}