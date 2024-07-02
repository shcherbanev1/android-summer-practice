package ru.kpfu.itis.shcherbanev

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import ru.kpfu.itis.shcherbanev.databinding.ActivityContainerBinding

class ActivityContainer : AppCompatActivity(){
    private var binding: ActivityContainerBinding? = null
    private var controller: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContainerBinding.inflate((layoutInflater))
        setContentView(binding?.root)

        controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
            .navController
        controller?.let { navController ->
            binding?.bottomNavigation?.setupWithNavController(navController)
        }
    }
}