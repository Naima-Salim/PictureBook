package gallery.mima.gallerybook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnExplore:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnExplore=findViewById(R.id.btnExplore)
        btnExplore.setOnClickListener {
            val intent= Intent(this,Flower::class.java)
            startActivity(intent)
        }

    }
}