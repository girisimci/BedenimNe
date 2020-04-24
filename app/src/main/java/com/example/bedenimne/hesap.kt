package com.example.bedenimne

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds


class hesap : Fragment() {

    lateinit var mAdView: AdView
    private var belKismi: EditText? = null
    private var btnErkek: Button? = null
    private var btnKadin: Button? = null
    private var cevap: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_hesap, container, false)

        var view = inflater.inflate(R.layout.fragment_hesap, container, false)

        MobileAds.initialize(context) {
            "ca-app-pub-3940256099942544/6300978111"
        }
        mAdView = view.findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        belKismi = view.findViewById(R.id.tv_bel_alim) as? EditText
        btnErkek = view.findViewById(R.id.btn_ic_erkek) as? Button
        btnKadin = view.findViewById(R.id.btn_ic_kadin) as? Button
        cevap = view.findViewById(R.id.sonuclarim_tv) as? TextView


        btnErkek?.setOnClickListener {
            if (belKismi?.text.toString().isNullOrEmpty()) {
                Toast.makeText(context, "LÜTFEN ÖLÇÜLERİ GİRİNİZ!", Toast.LENGTH_SHORT).show()
            } else {
                var girdi = belKismi?.text.toString().toInt()
                cevap?.text.toString()

                if (girdi in 77..82) {
                    cevap!!.text = "İç Çamaşır Bedeniniz XS'dir."
                } else if (girdi in 82..87) {
                    cevap!!.text = "İç Çamaşır Bedeniniz S'dir."
                } else if (girdi in 87..92) {
                    cevap!!.text = "İç Çamaşır Bedeniniz M'dir."
                } else if (girdi in 92..97) {
                    cevap!!.text = "İç Çamaşır Bedeniniz L'dir."
                } else if (girdi in 97..107) {
                    cevap!!.text = "İç Çamaşır Bedeniniz XL'dir."
                } else if (girdi in 107..112) {
                    cevap!!.text = "İç Çamaşır Bedeniniz XXL'dir."
                } else if (girdi in 112..117) {
                    cevap!!.text = "İç Çamaşır Bedeniniz 3XL'dir."
                } else if (girdi in 117..122) {
                    cevap!!.text = "İç Çamaşır Bedeniniz 4XL'dir."
                } else {
                    cevap!!.text = "Girdiğiniz sayı eksik veya hatalı."
                }

            }
        }



        btnKadin?.setOnClickListener {
            if (belKismi?.text.toString().isNullOrEmpty()) {
                Toast.makeText(context, "LÜTFEN ÖLÇÜLERİ GİRİNİZ!", Toast.LENGTH_SHORT).show()
            } else {
                var girdi = belKismi?.text.toString().toInt()
                cevap?.text.toString()

                if (girdi in 77..82) {
                    cevap!!.text = "İç Çamaşır Bedeniniz XS'dir."
                } else if (girdi in 82..87) {
                    cevap!!.text = "İç Çamaşır Bedeniniz S'dir."
                } else if (girdi in 87..92) {
                    cevap!!.text = "İç Çamaşır Bedeniniz M'dir."
                } else if (girdi in 92..97) {
                    cevap!!.text = "İç Çamaşır Bedeniniz L'dir."
                } else if (girdi in 97..102) {
                    cevap!!.text = "İç Çamaşır Bedeniniz XL'dir."
                } else if (girdi in 102..107) {
                    cevap!!.text = "İç Çamaşır Bedeniniz XXL'dir."
                } else if (girdi in 107..112) {
                    cevap!!.text = "İç Çamaşır Bedeniniz 3XL'dir."
                } else if (girdi in 112..117) {
                    cevap!!.text = "İç Çamaşır Bedeniniz 4XL'dir."
                } else {
                    cevap!!.text = "Girdiğiniz sayı eksik veya hatalı."
                }

            }
        }

        return view
    }
}
