package gallery.mima.gallerybook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Photoshop : AppCompatActivity() {
    lateinit var btnBack3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photoshop)
        btnBack3=findViewById(R.id.btnBack)
        btnBack3.setOnClickListener {
            val intent= Intent(this,Longdrive::class.java)
            startActivity(intent)
        }
        btnNext3=findViewById(R.id.btnNext)
        btnNext3.setOnClickListener {
            val intent= Intent(this,Food::class.java)
            startActivity(intent)
        }
    }
}