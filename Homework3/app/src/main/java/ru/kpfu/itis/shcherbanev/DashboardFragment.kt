package ru.kpfu.itis.shcherbanev

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.kpfu.itis.shcherbanev.databinding.FragmentDashboardBinding

class DashboardFragment: Fragment(R.layout.fragment_dashboard) {
    private var binding: FragmentDashboardBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDashboardBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}