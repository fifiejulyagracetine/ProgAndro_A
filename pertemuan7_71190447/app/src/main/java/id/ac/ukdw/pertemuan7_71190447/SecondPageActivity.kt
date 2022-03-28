package id.ac.ukdw.pertemuan7_71190447

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)

        val name = intent.getStringArrayExtra("nama")
        val number = intent.getStringArrayExtra("nomor")

        val txtInfo = findViewById<TextView>(R.id.txtInfo)
        txtInfo.text = "Nama : ${name}\n";"Nomor : ${number}"

    }
}