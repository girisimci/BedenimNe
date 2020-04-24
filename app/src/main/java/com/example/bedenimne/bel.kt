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

                if (belolcu in 78..80 && bacakOlcu in 77..90 && kalcaOlcu in 90..95) {
                    cevap!!.text = "Pantolon Bedeniniz 29"
                } else if (belolcu in 78..83 && bacakOlcu in 77..90 && kalcaOlcu in 90..97) {
                    cevap!!.text = "Pantolon Bedeniniz 30"
                } else if (belolcu in 78..85 && bacakOlcu in 77..90 && kalcaOlcu in 90..99) {
                    cevap!!.text = "Pantolon Bedeniniz 31"
                } else if (belolcu in 78..88 && bacakOlcu in 77..90 && kalcaOlcu in 90..102) {
                    cevap!!.text = "Pantolon Bedeniniz 32"
                } else if (belolcu in 78..90 && bacakOlcu in 77..90 && kalcaOlcu in 90..104) {
                    cevap!!.text = "Pantolon Bedeniniz 33"
                } else if (belolcu in 78..93 && bacakOlcu in 77..90 && kalcaOlcu in 90..107) {
                    cevap!!.text = "Pantolon Bedeniniz 34"
                } else if (belolcu in 78..98 && bacakOlcu in 77..90 && kalcaOlcu in 90..112) {
                    cevap!!.text = "Pantol  on Bedeniniz 36"
                } else if (belolcu in 78..103 && bacakOlcu in 77..90 && kalcaOlcu in 90..117) {
                    cevap!!.text = "Pantol  on Bedeniniz 38"
                } else if (belolcu in 78..108 && bacakOlcu in 77..90 && kalcaOlcu in 90..122) {
                    cevap!!.text = "Pantol  on Bedeniniz 40"
                } else cevap!!.text =
                    "Sonuç bulunamadı. Doğru yazdığınızdan emin olun ve tekrar deneyin."

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

                if (belolcu in 55..60 && bacakOlcu in 72..86 && kalcaOlcu in 83..86) {
                    cevap!!.text = "Pantolon Bedeniniz 32-XXS'dir."
                } else if (belolcu in 60..64 && bacakOlcu in 72..86 && kalcaOlcu in 86..90) {
                    cevap!!.text = "Pantolon Bedeniniz 34-XS'dir."
                } else if (belolcu in 64..68 && bacakOlcu in 72..86 && kalcaOlcu in 90..94) {
                    cevap!!.text = "Pantolon Bedeniniz 36-S'dir."
                } else if (belolcu in 68..72 && bacakOlcu in 72..86 && kalcaOlcu in 94..98) {
                    cevap!!.text = "Pantolon Bedeniniz 38-M'dir."
                } else if (belolcu in 72..76 && bacakOlcu in 72..86 && kalcaOlcu in 98..102) {
                    cevap!!.text = "Pantolon Bedeniniz 40-L'dir."
                } else if (belolcu in 76..80 && bacakOlcu in 72..86 && kalcaOlcu in 102..106) {
                    cevap!!.text = "Pantolon Bedeniniz 42-XL'dir."
                } else if (belolcu in 80..86 && bacakOlcu in 72..86 && kalcaOlcu in 106..112) {
                    cevap!!.text = "Pantol  on Bedeniniz 44-XXL'dir."
                } else if (belolcu in 86..92 && bacakOlcu in 72..86 && kalcaOlcu in 112..118) {
                    cevap!!.text = "Pantol  on Bedeniniz 46-3XL'dir."
                } else if (belolcu in 92..98 && bacakOlcu in 72..86 && kalcaOlcu in 118..124) {
                    cevap!!.text = "Pantol  on Bedeniniz 48-4XL'dir."
                } else cevap!!.text =
                    "Sonuç bulunamadı. Doğru yazdığınızdan emin olun ve tekrar deneyin."

            }
        }

        return view
    }
}
