package com.example.zhazira_3_7_cw

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.zhazira_3_7_cw.databinding.ItemCountryBinding

class CarAdapter(val countryList: List<Country>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent
            .context), parent, false))
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(countryList[position])
    }
}

class ViewHolder(val binding: ItemCountryBinding): RecyclerView.ViewHolder(binding.root){
    fun onBind(country: Country){
        Glide.with(binding.imgCountry).load(country.image).into(binding.imgCountry)
        binding.tvName.text = country.name
    }
}