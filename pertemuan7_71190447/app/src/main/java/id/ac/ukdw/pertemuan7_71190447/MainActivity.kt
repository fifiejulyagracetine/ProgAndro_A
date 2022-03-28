package id.ac.ukdw.pertemuan7_71190447

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listKontak = arrayListOf<Kontak>()
        listKontak.add(Kontak("Gio", "082255914757", R.mipmap.gio))
        listKontak.add(Kontak("Windy", "085241046416", R.mipmap.windy))
        listKontak.add(Kontak("Juriani", "081253013921", R.mipmap.juriani))
        listKontak.add(Kontak("Jekson", "081210324875", R.mipmap.jekson))
        listKontak.add(Kontak("Robert", "087755237066", R.mipmap.robert))
        listKontak.add(Kontak("Bily", "085727555083", R.mipmap.bily))
        listKontak.add(Kontak("Fira", "082192318299", R.mipmap.fira))
        listKontak.add(Kontak("Leo", "081263333602", R.mipmap.leo))
        listKontak.add(Kontak("Fifie", "082329594322", R.mipmap.fifie))

        val rcyKontak = findViewById<RecyclerView>(R.id.rcykontak)
        rcyKontak.layoutManager = LinearLayoutManager(this)
        val adapter = KontakAdapter(listKontak, this)
        rcyKontak.adapter = adapter

        val nama = findViewById<TextView>(R.id.txtNama)

        rcyKontak.setOnClickListener{
            val i = Intent(this, SecondPageActivity::class.java)
            i.putExtra( "nama", nama.text.toString())
            startActivity(i)
        }

    }
}