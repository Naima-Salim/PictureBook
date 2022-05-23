package gallery.mima.gallerybook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Iphone : AppCompatActivity() {
    lateinit var btnBack:Button
    lateinit var btnNext0:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iphone)
        btnBack=findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent= Intent(this,Flower::class.java)
            startActivity(intent)
        }
        btnNext0=findViewById(R.id.btnNext0)
        btnNext0.setOnClickListener {
            val intent= Intent(this,Longdrive::class.java)
            startActivity(intent)
        }
    }
}