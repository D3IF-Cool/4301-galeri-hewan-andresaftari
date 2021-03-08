package org.d3if3049.galerihewan.util

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.d3if3049.galerihewan.databinding.ListItemBinding
import org.d3if3049.galerihewan.model.Hewan

class MainAdapter(private val data: List<Hewan>) :
    RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder =
        MainViewHolder(
            ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) =
        holder.bind(data[position])

    override fun getItemCount() = data.size

    class MainViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(hewan: Hewan) = with(binding) {
            namaTextView.text = hewan.nama
            latinTextView.text = hewan.namaLatin
            ivAvatar.setImageResource(hewan.imageRes)
        }
    }
}