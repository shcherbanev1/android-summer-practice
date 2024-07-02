package ru.kpfu.itis.shcherbanev

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import ru.kpfu.itis.shcherbanev.databinding.FragmentProfileBinding

class ProfileFragment: Fragment(R.layout.fragment_profile) {
    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        binding?.apply {
            button.setOnClickListener {
                if (editText.text.toString().isNotEmpty()) {
                    findNavController().navigate(
                        resId = R.id.action_profileFragment_to_newNameFragment,
                        args = NewNameFragment.bundle(message = editText.text.toString())
                    )
                }
                else Snackbar.make(root, "You should fill the field", Snackbar.LENGTH_LONG).show()

            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}