package kz.course.movieapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.aboutItem -> {
                changeActivity()
                true
            }

            R.id.settingsItem-> {
                true
            }

            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

    private fun changeActivity() {
        intent = Intent(this, AboutApp::class.java)
        startActivity(intent)
    }
}