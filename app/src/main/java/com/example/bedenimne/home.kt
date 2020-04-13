package com.example.bedenimne

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment


class home : Fragment() {

    private lateinit var olcusu: EditText
    private lateinit var btn: Button
    private lateinit var cevap: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_home, container, false)

        var view = inflater.inflate(R.layout.fragment_home, container, false)
        olcusu = view.findViewById(R.id.tv_kafa_olcu)
        btn = view.findViewById(R.id.btn_kafa_sonuc)
        cevap = view.findViewById(R.id.tv_kafa_cevap)

        btn.setOnClickListener {


            var girdi: Int = olcusu.text.toString().toInt()
            cevap.text.toString()


            when (girdi) {
                53 -> cevap.text = "Şapka Bedeniniz XS'dir"
                54 -> cevap.text = "Şapka Bedeniniz XS'dir"
                55 -> cevap.text = "Şapka Bedeniniz S'dir"
                56 -> cevap.text = "Şapka Bedeniniz S'dir"
                57 -> cevap.text = "Şapka Bedeniniz M'dir"
                58 -> cevap.text = "Şapka Bedeniniz M'dir"
                59 -> cevap.text = "Şapka Bedeniniz L'dir"
                60 -> cevap.text = "Şapka Bedeniniz L'dir"
                61 -> cevap.text = "Şapka Bedeniniz XL'dir"
                62 -> cevap.text = "Şapka Bedeniniz XL'dir"

                else -> cevap.text = "Şapka Bedeniniz Bilinmiyor!"
            }

        }


        return view
        }

}


