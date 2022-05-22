package gallery.mima.gallerybook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Flower : AppCompatActivity() {
    lateinit var btnFlower:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower)
        btnFlower=findViewById(R.id.btnFlower)
        btnFlower.setOnClickListener {
            val intent= Intent(this,Iphone::class.java)
            startActivity(intent)
        }

    }
}