package controller

import android.annotation.SuppressLint
import utilities.EXTRA_PLAYER
import android.os.Bundle
import com.example.swoosh.model.Player
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

@Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class FinishActivity : BaseActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        finishText.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}
