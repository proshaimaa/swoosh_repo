package Controller

import android.os.Bundle
import Utilities.EXTRA_PLAYER
import android.content.Intent
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }
    fun onBeginnerSelected(view: View){
        ballerBtn.isChecked = false
        player.skill = "beginner"
    }
    fun onBallerSelected(view: View){
        beginnerBtn.isChecked = false
        player.skill = "baller"
    }
    fun onFinishSelected(view: View){
        if(player.skill != ""){
            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a skill level. ",Toast.LENGTH_SHORT).show()
        }
    }

}
