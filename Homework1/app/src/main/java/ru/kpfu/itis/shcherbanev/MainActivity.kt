package ru.kpfu.itis.shcherbanev

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.doOnTextChanged
import ru.kpfu.itis.shcherbanev.race.RaceManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTextCarsNumber: EditText = findViewById(R.id.editTextCarNumber)
        val buttonStartRace: Button = findViewById(R.id.buttonStartRace)

        editTextCarsNumber.doOnTextChanged { text, _, _, _ ->
            buttonStartRace.isEnabled = (text.toString().toIntOrNull() ?: 0) > 0
        }
        var carsNumber: Int
        buttonStartRace.setOnClickListener {
            carsNumber = editTextCarsNumber.text.toString().toInt()

            val raceManager = RaceManager()
            raceManager.startRace(carsNumber)
        }
    }
}