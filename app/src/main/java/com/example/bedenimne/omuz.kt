package com.example.bedenimne

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class omuz : Fragment() {


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
        en = view.findViewById(R.id.tv_omuz_olcu) as? EditText
        boy = view.findViewById(R.id.tv_omuz_boy) as? EditText
        btnErkek = view.findViewById(R.id.btn_omuz_erkek) as? Button
        btnKadin = view.findViewById(R.id.btn_omuz_kadin) as? Button
        cevap = view.findViewById(R.id.tv_omuz_sonuc) as? TextView



        btnKadin?.setOnClickListener {

            var genislik = en?.text.toString().toInt()
            var yukseklik = boy?.text.toString().toInt()
            cevap?.text.toString()



            if (genislik in 82..86 && yukseklik in 158..162) {
                cevap!!.text = "T-Shirt Bedeniniz XS'dir."
            } else if (genislik in 86..90 && yukseklik in 162..166) {
                cevap!!.text = "T-Shirt Bedeniniz S'dir."
            } else if (genislik in 90..96 && yukseklik in 166..170) {
                cevap!!.text = "T-Shirt Bedeniniz M'dir."
            } else if (genislik in 96..102 && yukseklik in 170..174) {
                cevap!!.text = "T-Shirt Bedeniniz L'dir."
            } else if (genislik in 102..110 && yukseklik in 174..178) {
                cevap!!.text = "T-Shirt Bedeniniz XL'dir."
            } else if (genislik in 110..116 && yukseklik in 178..180) {
                cevap!!.text = "T-Shirt Bedeniniz XXL'dir."
            } else {
                cevap!!.text = "Böyle bir sonuç bulunamamaktadır."
            }


        }


        btnErkek?.setOnClickListener {

            var genislik = en?.text.toString().toInt()
            var yukseklik = boy?.text.toString().toInt()
            cevap?.text.toString()



            if (genislik in 90..94 && yukseklik in 168..172) {
                cevap!!.text = "T-Shirt Bedeniniz XS'dir."
            } else if (genislik in 94..100 && yukseklik in 172..176) {
                cevap!!.text = "T-Shirt Bedeniniz S'dir."
            } else if (genislik in 100..104 && yukseklik in 176..180) {
                cevap!!.text = "T-Shirt Bedeniniz M'dir."
            } else if (genislik in 104..112 && yukseklik in 180..184) {
                cevap!!.text = "T-Shirt Bedeniniz L'dir."
            } else if (genislik in 112..120 && yukseklik in 184..188) {
                cevap!!.text = "T-Shirt Bedeniniz XL'dir."
            } else if (genislik in 120..128 && yukseklik in 188..192) {
                cevap!!.text = "T-Shirt Bedeniniz XXL'dir."
            } else if (genislik in 120..128 && yukseklik in 188..192) {
                cevap!!.text = "T-Shirt Bedeniniz XXXL'dir."
            } else {
                cevap!!.text = "Böyle bir sonuç bulunamamaktadır."
            }


        }





        return view
    }

}
