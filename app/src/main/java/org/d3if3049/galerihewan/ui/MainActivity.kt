package org.d3if3049.galerihewan.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import org.d3if3049.galerihewan.R
import org.d3if3049.galerihewan.databinding.ActivityMainBinding
import org.d3if3049.galerihewan.model.Hewan
import org.d3if3049.galerihewan.util.MainAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("MainActivity_CekJumlah", "Jumlah data: " + getData().size)

        with(binding.rvMain) {
//            addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
    }

    private fun getData() = listOf(
        Hewan("Angsa", "Cygnus olor", TAG_UNGGAS, R.drawable.angsa),
        Hewan("Ayam", "Gallus gallus", TAG_UNGGAS, R.drawable.ayam),
        Hewan("Bebek", "Cairina moschata", TAG_UNGGAS, R.drawable.bebek),
        Hewan("Domba", "Ovis ammon", TAG_MAMALIA, R.drawable.domba),
        Hewan("Kalkun", "Meleagris gallopavo", TAG_UNGGAS, R.drawable.kalkun),
        Hewan("Kambing", "Capricornis sumatrensis", TAG_MAMALIA, R.drawable.kambing),
        Hewan("Kelinci", "Oryctolagus cuniculus", TAG_MAMALIA, R.drawable.kelinci),
        Hewan("Kerbau", "Bubalus bubalis", TAG_MAMALIA, R.drawable.kerbau),
        Hewan("Kuda", "Equus caballus", TAG_MAMALIA, R.drawable.kuda),
        Hewan("Sapi", "Bos taurus", TAG_MAMALIA, R.drawable.sapi)
    )

    companion object {
        const val TAG_UNGGAS = "Unggas"
        const val TAG_MAMALIA = "Mamalia"
    }
}