package Controller

import Utilities.EXTRA_PLAYER
import android.os.Bundle
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        finishText.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
