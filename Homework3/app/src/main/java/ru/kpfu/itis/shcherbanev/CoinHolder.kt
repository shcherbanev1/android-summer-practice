package ru.kpfu.itis.shcherbanev

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import ru.kpfu.itis.shcherbanev.databinding.ItemCoinBinding

class CoinHolder (
    private val binding: ItemCoinBinding,
    private val glide: RequestManager,
    private val onClick: (Coin) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    private val requestOptions = RequestOptions
        .diskCacheStrategyOf(
            DiskCacheStrategy.ALL
        )

    private val context: Context
        get() = itemView.context

    fun onBind(coin: Coin) {
        binding.run {
            tvCoinName.text = coin.name
            tvPrice.text = coin.price.toString()

            glide
                .load(coin.pictureUrl)
                .error(R.drawable.img_not_found)
                .placeholder(R.drawable.img)
                .apply(requestOptions)
                .into(ivImage)

            root.setOnClickListener {
                onClick.invoke(coin)
            }

            tvPrice.setTextColor(context.getColor(coin.getTitleColor()))
        }
    }

    private fun Coin.getTitleColor(): Int = if (pictureUrl.length > 120) {
        R.color.purple_200
    } else {
        R.color.teal_200
    }
}