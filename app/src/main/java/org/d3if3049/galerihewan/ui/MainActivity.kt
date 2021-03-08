package org.d3if3049.galerihewan.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
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
            addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
//            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
    }

    private fun getData() = listOf(
            Hewan("Angsa", "Cygnus olor", R.drawable.angsa),
            Hewan("Ayam", "Gallus gallus", R.drawable.ayam),
            Hewan("Bebek", "Cairina moschata", R.drawable.bebek),
            Hewan("Domba", "Ovis ammon", R.drawable.domba),
            Hewan("Kalkun", "Meleagris gallopavo", R.drawable.kalkun),
            Hewan("Kambing", "Capricornis sumatrensis", R.drawable.kambing),
            Hewan("Kelinci", "Oryctolagus cuniculus", R.drawable.kelinci),
            Hewan("Kerbau", "Bubalus bubalis", R.drawable.kerbau),
            Hewan("Kuda", "Equus caballus", R.drawable.kuda),
            Hewan("Sapi", "Bos taurus", R.drawable.sapi)
    )
}