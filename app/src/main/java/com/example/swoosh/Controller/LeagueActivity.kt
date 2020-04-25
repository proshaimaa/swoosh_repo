package Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import Utilities.EXTRA_PLAYER
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenClicked(view: View){

        womenLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "men"

    }
    fun onWomenClicked(view: View){

        menLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "women"

    }
    fun onCoedClicked(view: View){

        menLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

        player.league = "co-ed"

    }

    fun leagueNextBtn(view : View){
        if(player.league != "") {
            val nextIntent = Intent(this, SkillActivity::class.java)
            nextIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(nextIntent)
        }else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }
    }
}
