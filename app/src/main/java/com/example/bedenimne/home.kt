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


class home : Fragment() {

    lateinit var mAdView: AdView
    private var olcusu: EditText? = null
    private var btn: Button? = null
    private var cevap: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_home, container, false)
        var view = inflater.inflate(R.layout.fragment_home, container, false)

        MobileAds.initialize(context) {
            "ca-app-pub-3940256099942544/6300978111"
        }
        mAdView = view.findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        /*val adView = AdView(context)
        adView.adSize = AdSize.BANNER
        adView.adUnitId = "ca-app-pub-3940256099942544/6300978111"*/

        olcusu = view.findViewById(R.id.tv_kafa_olcu)
        btn = view.findViewById(R.id.btn_kafa_sonuc)
        cevap = view.findViewById(R.id.tv_kafa_cevap)



        btn!!.setOnClickListener {
            if (olcusu?.text.toString().isNullOrEmpty()) {
                Toast.makeText(context, "LÜTFEN ÖLÇÜLERİ GİRİNİZ!", Toast.LENGTH_SHORT).show()
            } else {
                var girdi = olcusu?.text.toString()
                cevap?.text.toString()


                when (girdi) {
                    "53" -> cevap?.text = "Şapka Bedeniniz XS'dir"
                    "54" -> cevap?.text = "Şapka Bedeniniz XS'dir"
                    "55" -> cevap?.text = "Şapka Bedeniniz S'dir"
                    "56" -> cevap?.text = "Şapka Bedeniniz S'dir"
                    "57" -> cevap?.text = "Şapka Bedeniniz M'dir"
                    "58" -> cevap?.text = "Şapka Bedeniniz M'dir"
                    "59" -> cevap?.text = "Şapka Bedeniniz L'dir"
                    "60" -> cevap?.text = "Şapka Bedeniniz L'dir"
                    "61" -> cevap?.text = "Şapka Bedeniniz XL'dir"
                    "62" -> cevap?.text = "Şapka Bedeniniz XL'dir"

                    else -> cevap?.text =
                        "Standart dışı beden ölçüleri girdiniz,lütfen kontrol edip tekrar deneyin."
                }

            }

        }


        return view
        }

}


