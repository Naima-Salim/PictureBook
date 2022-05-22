package gallery.mima.gallerybook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Food : AppCompatActivity() {
    lateinit var btnBack4:Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        btnBack4=findViewById(R.id.btnBack)
        btnBack4.setOnClickListener {
            val intent= Intent(this,Photoshop::class.java)
            startActivity(intent)
        }
        btnNext4=findViewById(R.id.btnNext)
        btnNext4.setOnClickListener {
            val intent= Intent(this,Flower::class.java)
            startActivity(intent)
        }
    }
}