package com.example.bedenimne

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*


class home : Fragment() {

    private var olcusu: EditText? = null
    private var btn: Button? = null
    private var cevap: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

        hesap()

    }

    private fun hesap() {

        var olcusu = tv_kafa_olcu.text as EditText
        var btn = btn_kafa_sonuc as Button
        var cevap = tv_kafa_cevap.text as TextView

        btn.setOnClickListener {
            val n1 = olcusu.toString().toInt()

            if (n1 == 54 || n1 == 53) {
                cevap.text = "Xs bedene sahipsiniz."
            }
        }
    }

}
