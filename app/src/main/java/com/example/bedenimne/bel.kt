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


class bel : Fragment() {

    lateinit var mAdView: AdView
    private var Bel: EditText? = null
    private var Bacak: EditText? = null
    private var Kalca: EditText? = null
    private var btnErkek: Button? = null
    private var cevap: TextView? = null
    private var btnKadin: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_bel, container, false)
        var view = inflater.inflate(R.layout.fragment_bel, container, false)

        MobileAds.initialize(context) {
            "ca-app-pub-3940256099942544/6300978111"
        }
        mAdView = view.findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        Bel = view.findViewById(R.id.tv_bel_olcu) as? EditText
        Bacak = view.findViewById(R.id.tv_bel_boy) as? EditText
        Kalca = view.findViewById(R.id.tv_bel_kalca) as? EditText
        btnErkek = view.findViewById(R.id.btn_ic_kadin) as? Button
        btnKadin = view.findViewById(R.id.btn_bel_kadin) as? Button
        cevap = view.findViewById(R.id.tv_bel_sonuc) as? TextView

        btnErkek?.setOnClickListener {
            if (Bel?.text.toString().isNullOrEmpty() && Bacak?.text.toString()
                    .isNullOrEmpty() && Kalca?.text.toString().isNullOrEmpty()
            ) {
                Toast.makeText(context, "LÜTFEN ÖLÇÜLERİ GİRİNİZ!", Toast.LENGTH_SHORT).show()
            } else {
                var belolcu = Bel?.text.toString().toInt()
                var bacakOlcu = Bacak?.text.toString().toInt()
                var kalcaOlcu = Kalca?.text.toString().toInt()

                cevap?.text.toString()

                if (belolcu in 73..79 && bacakOlcu in 70..110 && kalcaOlcu in 90..97) {
                    cevap!!.text = "Pantolon Bedeniniz 29"
                } else if (belolcu in 79..81 && bacakOlcu in 70..110 && kalcaOlcu in 97..99) {
                    cevap!!.text = "Pantolon Bedeniniz 30"
                } else if (belolcu in 81..84 && bacakOlcu in 70..110 && kalcaOlcu in 99..102) {
                    cevap!!.text = "Pantolon Bedeniniz 31"
                } else if (belolcu in 84..86 && bacakOlcu in 70..110 && kalcaOlcu in 102..104) {
                    cevap!!.text = "Pantolon Bedeniniz 32"
                } else if (belolcu in 86..89 && bacakOlcu in 70..110 && kalcaOlcu in 104..107) {
                    cevap!!.text = "Pantolon Bedeniniz 33"
                } else if (belolcu in 89..91 && bacakOlcu in 70..110 && kalcaOlcu in 107..109) {
                    cevap!!.text = "Pantolon Bedeniniz 34"
                } else if (belolcu in 91..96 && bacakOlcu in 70..110 && kalcaOlcu in 109..114) {
                    cevap!!.text = "Pantolon Bedeniniz 36"
                } else if (belolcu in 96..101 && bacakOlcu in 70..110 && kalcaOlcu in 114..119) {
                    cevap!!.text = "Pantolon Bedeniniz 38"
                } else if (belolcu in 101..106 && bacakOlcu in 70..110 && kalcaOlcu in 119..124) {
                    cevap!!.text = "Pantolon Bedeniniz 40"
                } else if (belolcu in 106..111 && bacakOlcu in 70..110 && kalcaOlcu in 124..129) {
                    cevap!!.text = "Pantolon Bedeniniz 42"
                } else cevap!!.text =
                    "Standart dışı beden ölçüleri girdiniz,lütfen kontrol edip tekrar deneyin."

            }
        }

        btnKadin?.setOnClickListener {
            if (Bel?.text.toString().isNullOrEmpty() && Bacak?.text.toString()
                    .isNullOrEmpty() && Kalca?.text.toString().isNullOrEmpty()
            ) {
                Toast.makeText(context, "LÜTFEN ÖLÇÜLERİ GİRİNİZ!", Toast.LENGTH_SHORT).show()
            } else {
                var belolcu = Bel?.text.toString().toInt()
                var bacakOlcu = Bacak?.text.toString().toInt()
                var kalcaOlcu = Kalca?.text.toString().toInt()

                cevap?.text.toString()

                if (belolcu in 55..58 && bacakOlcu in 70..110 && kalcaOlcu in 80..125) {
                    cevap!!.text = "Pantolon Bedeniniz 32"
                } else if (belolcu in 59..63 && bacakOlcu in 70..110 && kalcaOlcu in 80..125) {
                    cevap!!.text = "Pantolon Bedeniniz 34"
                } else if (belolcu in 64..68 && bacakOlcu in 70..110 && kalcaOlcu in 80..125) {
                    cevap!!.text = "Pantolon Bedeniniz 36"
                } else if (belolcu in 69..73 && bacakOlcu in 70..110 && kalcaOlcu in 80..125) {
                    cevap!!.text = "Pantolon Bedeniniz 38"
                } else if (belolcu in 74..79 && bacakOlcu in 70..110 && kalcaOlcu in 80..125) {
                    cevap!!.text = "Pantolon Bedeniniz 40"
                } else if (belolcu in 80..86 && bacakOlcu in 70..110 && kalcaOlcu in 80..125) {
                    cevap!!.text = "Pantolon Bedeniniz 42"
                } else if (belolcu in 87..93 && bacakOlcu in 70..110 && kalcaOlcu in 80..125) {
                    cevap!!.text = "Pantol  on Bedeniniz 44"
                } else if (belolcu in 94..100 && bacakOlcu in 70..110 && kalcaOlcu in 80..125) {
                    cevap!!.text = "Pantol  on Bedeniniz 46"
                } else cevap!!.text =
                    "Standart dışı beden ölçüleri girdiniz,lütfen kontrol edip tekrar deneyin."

            }
        }

        return view
    }
}
