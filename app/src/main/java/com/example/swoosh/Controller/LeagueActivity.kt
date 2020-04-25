package Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMenClicked(view: View){

        womenLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "men"

    }
    fun onWomenClicked(view: View){

        menLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "women"

    }
    fun onCoedClicked(view: View){

        menLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

        selectedLeague = "co-ed"

    }

    fun leagueNextBtn(view : View){
        if(selectedLeague != "") {
            val nextIntent = Intent(this, SkillActivity::class.java)
            nextIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(nextIntent)
        }else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }
    }
}
