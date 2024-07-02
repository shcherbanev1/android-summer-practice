package ru.kpfu.itis.shcherbanev

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import ru.kpfu.itis.shcherbanev.databinding.ItemCoinBinding

class CoinAdapter(
    private var list: List<Coin>,
    private val glide: RequestManager,
    private val onClick: (Coin) -> Unit,
) : RecyclerView.Adapter<CoinHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CoinHolder = CoinHolder(
        binding = ItemCoinBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        glide = glide,
        onClick = onClick,
    )

    override fun onBindViewHolder(holder: CoinHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    fun updateDataset(newList: List<Coin>) {
        list = newList
        notifyDataSetChanged()
    }
}