package Controller

import Utilities.EXTRA_LEAGUE
import Utilities.EXTRA_SKILL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        finishText.text = "Looking for a $league $skill league near you..."
    }
}
