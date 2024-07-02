package ru.kpfu.itis.shcherbanev

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.kpfu.itis.shcherbanev.databinding.FragmentNewnameBinding

class NewNameFragment : Fragment(R.layout.fragment_newname) {

    private var binding: FragmentNewnameBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNewnameBinding.bind(view)

        val message = arguments?.getString(ARG_MESSAGE) ?: "You should fill the field"

        binding?.apply {
            tvMessage.text = "now your name is - $message"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val ARG_MESSAGE = "ARG_MESSAGE"

        fun bundle(message: String): Bundle = Bundle().apply {
            putString(ARG_MESSAGE, message)
        }
    }
}