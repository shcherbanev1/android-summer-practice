package ru.kpfu.itis.shcherbanev

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import ru.kpfu.itis.shcherbanev.databinding.FragmentCoinBinding

class CoinFragment: Fragment(R.layout.fragment_coin) {
    private var binding: FragmentCoinBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCoinBinding.bind(view)
        val coin = CoinRepository.coins.find {
            it.id == (arguments?.getInt(ARG_ID) ?: -1)
        }

        binding?.run {
            back.setOnClickListener{
                findNavController().navigate(
                    resId = R.id.action_coinFragment_to_homeFragment
                )
            }
            if (coin != null){
                tvName.text = coin.name
                tvInfo.text = coin.information
                tvPrice.text = "Current price: $" + coin.price.toString()
                Glide.with(imageView.context)
                    .load(coin.pictureUrl)
                    .into(imageView)
            } else tvInfo.text = "ERROR"
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    companion object {
        private const val ARG_ID = "ARG_ID"
        fun bundle(id: Int): Bundle = Bundle().apply {
            putInt(ARG_ID, id)
        }
    }

}