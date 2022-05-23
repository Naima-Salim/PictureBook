package gallery.mima.gallerybook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Longdrive : AppCompatActivity() {
    lateinit var btnBack2:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_longdrive)
        btnBack2=findViewById(R.id.btnBack2)
        btnBack2.setOnClickListener {
            val intent= Intent(this,Iphone::class.java)
            startActivity(intent)
        }
        btnNext2=findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent= Intent(this,Photoshop::class.java)
            startActivity(intent)
        }
    }
}