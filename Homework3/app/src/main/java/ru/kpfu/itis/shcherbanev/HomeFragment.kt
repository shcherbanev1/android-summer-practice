package ru.kpfu.itis.shcherbanev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import ru.kpfu.itis.shcherbanev.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var binding: FragmentHomeBinding? = null
    private var adapter: CoinAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        initAdapter()
    }

    private fun initAdapter() {
        binding?.run {
            adapter = CoinAdapter(
                list = CoinRepository.coins,
                glide = Glide.with(this@HomeFragment),
                onClick = {
                    findNavController().navigate(
                        resId = R.id.action_homeFragment_to_coinFragment,
                        args = CoinFragment.bundle(id = it.id)
                    )
                }
            )

            rvCoin.adapter = adapter
            rvCoin.layoutManager = LinearLayoutManager(requireContext())

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}