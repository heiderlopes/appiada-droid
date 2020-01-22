package br.com.heiderlopes.appiada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var lastJokerIndex = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showJoker()

        btTellJoker.setOnClickListener {
            showJoker()
        }
    }

    private fun showJoker() {

        val jokers = resources.getStringArray(R.array.jokers)
        var numberJoker = Random().nextInt(jokers.size)
        while (numberJoker == lastJokerIndex) {
            numberJoker = Random().nextInt(jokers.size)
        }
        val joker = jokers[numberJoker]
        tvJoker.text = joker
        lastJokerIndex = numberJoker
    }
}



