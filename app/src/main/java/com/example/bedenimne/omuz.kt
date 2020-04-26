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

class omuz : Fragment() {

    lateinit var mAdView: AdView
    private var en: EditText? = null
    private var boy: EditText? = null
    private var btnErkek: Button? = null
    private var cevap: TextView? = null
    private var btnKadin: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_omuz, container, false)

        var view = inflater.inflate(R.layout.fragment_omuz, container, false)

        MobileAds.initialize(context) {
            "ca-app-pub-3940256099942544/6300978111"
        }
        mAdView = view.findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        en = view.findViewById(R.id.tv_omuz_olcu) as? EditText
        boy = view.findViewById(R.id.tv_omuz_boy) as? EditText
        btnErkek = view.findViewById(R.id.btn_ic_kadin) as? Button
        btnKadin = view.findViewById(R.id.btn_omuz_kadin) as? Button
        cevap = view.findViewById(R.id.tv_omuz_sonuc) as? TextView



        btnKadin?.setOnClickListener {

            if (en?.text.toString().isNullOrEmpty() && boy?.text.toString().isNullOrEmpty()) {
                Toast.makeText(context, "LÜTFEN ÖLÇÜLERİ GİRİNİZ!", Toast.LENGTH_SHORT).show()
            } else {
                var genislik = en?.text.toString().toInt()
                var yukseklik = boy?.text.toString().toInt()

                cevap?.text.toString()


                //sonuç başarıyla döndürüldü

                if (genislik in 75..82 && yukseklik in 59..93) {
                    cevap?.text = "T-Shirt Bedeniniz XS'dir."
                } else if (genislik in 83..87 && yukseklik in 59..93) {
                    cevap?.text = "T-Shirt Bedeniniz S'dir."
                } else if (genislik in 88..92 && yukseklik in 59..93) {
                    cevap?.text = "T-Shirt Bedeniniz M'dir."
                } else if (genislik in 93..98 && yukseklik in 59..93) {
                    cevap?.text = "T-Shirt Bedeniniz L'dir."
                } else if (genislik in 99..105 && yukseklik in 59..93) {
                    cevap?.text = "T-Shirt Bedeniniz XL'dir."
                } else if (genislik in 106..116 && yukseklik in 59..100) {
                    cevap?.text = "T-Shirt Bedeniniz XXL'dir."
                } else {
                    cevap?.text =
                        "Standart dışı beden ölçüleri girdiniz,lütfen kontrol edip tekrar deneyin."
                }

            }
        }


        btnErkek?.setOnClickListener {

            if (en?.text.toString().isNullOrEmpty() && boy?.text.toString().isNullOrEmpty()) {
                Toast.makeText(context, "LÜTFEN ÖLÇÜLERİ GİRİNİZ!", Toast.LENGTH_SHORT).show()
            } else {

                var genislik = en?.text.toString().toInt()
                var yukseklik = boy?.text.toString().toInt()
                cevap?.text.toString()



                if (genislik in 80..91 && yukseklik in 60..108) {
                    cevap?.text = "T-Shirt Bedeniniz XS'dir."
                } else if (genislik in 92..96 && yukseklik in 69..108) {
                    cevap?.text = "T-Shirt Bedeniniz S'dir."
                } else if (genislik in 97..101 && yukseklik in 69..108) {
                    cevap?.text = "T-Shirt Bedeniniz M'dir."
                } else if (genislik in 102..106 && yukseklik in 69..108) {
                    cevap?.text = "T-Shirt Bedeniniz L'dir."
                } else if (genislik in 107..111 && yukseklik in 69..108) {
                    cevap?.text = "T-Shirt Bedeniniz XL'dir."
                } else if (genislik in 112..118 && yukseklik in 69..108) {
                    cevap?.text = "T-Shirt Bedeniniz XXL'dir."
                } else if (genislik in 119..130 && yukseklik in 69..108) {
                    cevap?.text = "T-Shirt Bedeniniz XXXL'dir."
                } else {
                    cevap?.text =
                        "Standart dışı beden ölçüleri girdiniz,lütfen kontrol edip tekrar deneyin."
                }


            }
        }




        return view
    }

}
